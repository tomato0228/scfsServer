package ltd.tomato.service.Impl;

import com.alibaba.fastjson.JSONObject;
import ltd.tomato.mapper.*;
import ltd.tomato.model.*;
import ltd.tomato.service.ChatService;
import ltd.tomato.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("Chat")
public class ChatServiceImpl implements ChatService {
    @Autowired(required = false)
    ChatMapper chatMapper;
    @Autowired(required = false)
    ChatViewMapper chatViewMapper;
    @Autowired(required = false)
    ContactViewMapper contactViewMapper;
    @Autowired(required = false)
    UserMapper userMapper;
    @Autowired(required = false)
    StudentMapper studentMapper;
    @Autowired(required = false)
    ParentsMapper parentsMapper;
    @Autowired(required = false)
    TclassMapper tclassMapper;

    @Override
    public Map<String, Object> getChatList(JSONObject object) {
        int total = 0;
        Map<String, Object> resultSet = new HashMap<>(16);
        try {
            if (object.getInteger("sendId") != null && object.getInteger("receiveId") != null && object.getInteger("chatMesg") != null) {
                List<Chat> chats;
                ChatExample chatExample = new ChatExample();
                ChatExample.Criteria criteria = chatExample.createCriteria();
                criteria.andSendIdEqualTo(object.getInteger("receiveId"));
                criteria.andReceiveIdEqualTo(object.getInteger("sendId"));
                if (object.getInteger("chatMesg") == 0) {
                    criteria.andChatMesgEqualTo(0);
                } else {
                    ChatExample.Criteria criteria_or = chatExample.createCriteria();
                    criteria_or.andSendIdEqualTo(object.getInteger("sendId"));
                    criteria_or.andReceiveIdEqualTo(object.getInteger("receiveId"));
                    chatExample.or(criteria_or);
                }
                chatExample.setOrderByClause("chat_date DESC");
                chats = chatMapper.selectByExample(chatExample);
                if (chats != null) {
                    total = chats.size();
                }
                resultSet.put("status", 0);
                resultSet.put("message", "获取消息列表成功！");
                resultSet.put("total", total);
                resultSet.put("data", chats);
            } else {
                resultSet.put("status", 1);
                resultSet.put("message", "获取消息列表失败！");
                resultSet.put("total", total);
                resultSet.put("data", new ArrayList<>(16));
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultSet.put("status", 100);
            resultSet.put("message", "获取消息列表错误！");
            resultSet.put("total", 0);
            resultSet.put("data", new ArrayList<>(16));
        }
        return resultSet;
    }

    @Override
    public Map<String, Object> getChat(JSONObject object) {
        int total = 0;
        Map<String, Object> resultSet = new HashMap<>(16);
        try {
            if (object.getInteger("chatId") != null) {
                Chat chat = chatMapper.selectByPrimaryKey(object.getInteger("chatId"));
                total = chat == null ? 0 : 1;
                resultSet.put("status", 0);
                resultSet.put("message", "获取消息成功！");
                resultSet.put("total", total);
                resultSet.put("data", chat);
            } else {
                resultSet.put("status", 1);
                resultSet.put("message", "获取消息失败！");
                resultSet.put("total", total);
                resultSet.put("data", null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultSet.put("status", 100);
            resultSet.put("message", "获取消息错误！");
            resultSet.put("total", 0);
            resultSet.put("data", null);
        }
        return resultSet;
    }

    @Override
    public Map<String, Object> getChatContactsByUser(JSONObject object) {
        int total = 0;
        Map<String, Object> resultSet = new HashMap<>(16);
        try {
            if (object.getInteger("userId") != null) {
                ContactViewExample contactViewsExample = new ContactViewExample();
                ContactViewExample.Criteria criteria = contactViewsExample.createCriteria();
                criteria.andOtherIdEqualTo(object.getInteger("userId"));
                List<ContactView> contactViews = contactViewMapper.selectByExample(contactViewsExample);
                total = contactViews.size();
                resultSet.put("status", 0);
                resultSet.put("message", "获取已聊天联系人列表成功！");
                resultSet.put("total", total);
                resultSet.put("data", contactViews);
            } else {
                resultSet.put("status", 1);
                resultSet.put("message", "获取已聊天联系人列表失败！");
                resultSet.put("total", total);
                resultSet.put("data", new ArrayList<>(16));
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultSet.put("status", 100);
            resultSet.put("message", "获取已聊天联系人列表错误！");
            resultSet.put("total", 0);
            resultSet.put("data", new ArrayList<>(16));
        }
        return resultSet;
    }

    @Override
    public Map<String, Object> getContactsByUser(JSONObject object) {
        int total = 0;
        Map<String, Object> resultSet = new HashMap<>(16);
        try {
            if (object.getInteger("userId") != null && !StringUtil.isNULLOREmpty(object.getString("contactsType"))) {
                List<User> users;
                User user = userMapper.selectByPrimaryKey(object.getInteger("userId"));
                Integer classId;
                List<Integer> userIds = new ArrayList<>(16);
                if (user.getUserType().equals("教师")) {
                    classId = object.getInteger("classId");
                } else if (user.getUserType().equals("家长")) {
                    classId = studentMapper.selectByPrimaryKey(parentsMapper.selectByPrimaryKey(user.getUserId()).getStudentId()).getClassId();
                } else {
                    classId = studentMapper.selectByPrimaryKey(user.getUserId()).getClassId();
                }
                UserExample userExample = new UserExample();
                UserExample.Criteria criteria = userExample.createCriteria();
                if (object.getString("contactsType").equals("教师")) {
                    TclassExample tclassExample = new TclassExample();
                    TclassExample.Criteria criteria_t = tclassExample.createCriteria();
                    criteria_t.andClassIdEqualTo(classId);
                    criteria_t.andTclassValidationEqualTo("审核通过");
                    List<Tclass> tclasses = tclassMapper.selectByExample(tclassExample);
                    List<Integer> teacherIds = new ArrayList<>();
                    for (Tclass t : tclasses) {
                        if (!teacherIds.contains(t.getTeacherId())) {
                            teacherIds.add(t.getTeacherId());
                        }
                    }
                    if (teacherIds.size() > 0) {
                        criteria.andUserIdIn(teacherIds);
                        criteria.andUserIdNotEqualTo(user.getUserId());
                        users = userMapper.selectByExample(userExample);
                    } else {
                        users = new ArrayList<>(16);
                    }
                } else {
                    StudentExample studentExample = new StudentExample();
                    StudentExample.Criteria criteria_s = studentExample.createCriteria();
                    criteria_s.andClassIdEqualTo(classId);
                    List<Student> students = studentMapper.selectByExample(studentExample);
                    for (Student s : students) {
                        if (!userIds.contains(s.getStudentId())) {
                            userIds.add(s.getStudentId());
                        }
                    }
                    if (object.getString("contactsType").equals("家长")) {
                        ParentsExample parentsExample = new ParentsExample();
                        ParentsExample.Criteria criteria_p = parentsExample.createCriteria();
                        if (userIds.size() > 0) {
                            criteria_p.andStudentIdIn(userIds);
                            List<Parents> parents = parentsMapper.selectByExample(parentsExample);
                            userIds.clear();
                            for (Parents p : parents) {
                                if (!userIds.contains(p.getParentsId())) {
                                    userIds.add(p.getParentsId());
                                }
                            }
                        }
                    }
                    if (userIds.size() > 0) {
                        criteria.andUserIdIn(userIds);
                        criteria.andUserIdNotEqualTo(user.getUserId());
                        users = userMapper.selectByExample(userExample);
                    } else {
                        users = new ArrayList<>(16);
                    }
                }
                total = users.size();
                resultSet.put("status", 0);
                resultSet.put("message", "获取联系人列表成功！");
                resultSet.put("total", total);
                resultSet.put("data", users);
            } else {
                resultSet.put("status", 1);
                resultSet.put("message", "获取联系人列表失败！");
                resultSet.put("total", total);
                resultSet.put("data", new ArrayList<>(16));
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultSet.put("status", 100);
            resultSet.put("message", "获取联系人列表错误！");
            resultSet.put("total", 0);
            resultSet.put("data", new ArrayList<>(16));
        }
        return resultSet;
    }

    @Override
    public Map<String, Object> addChat(JSONObject object) {
        int total = 0;
        Map<String, Object> resultSet = new HashMap<>(16);
        try {
            if (object.getInteger("sendId") != null && object.getInteger("receiveId") != null && object.getInteger("chatType") != null && !StringUtil.isNULLOREmpty(object.getString("chatContent"))) {
                int status;
                Chat chat = new Chat();
                chat.setSendId(object.getInteger("sendId"));
                chat.setReceiveId(object.getInteger("receiveId"));
                chat.setChatContent(object.getString("chatContent"));
                chat.setChatType(object.getInteger("chatType"));
                chat.setChatDate(new Date());
                chat.setChatMesg(0);
                chatMapper.insertSelective(chat);
                status = chat.getChatId();
                resultSet.put("status", 0);
                resultSet.put("message", "发送消息成功！");
                resultSet.put("total", total);
                resultSet.put("data", status);
            } else {
                resultSet.put("status", 1);
                resultSet.put("message", "发送消息失败！");
                resultSet.put("total", 0);
                resultSet.put("data", 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultSet.put("status", 100);
            resultSet.put("message", "发送消息错误！");
            resultSet.put("total", 0);
            resultSet.put("data", 0);
        }
        return resultSet;
    }

    @Override
    public Map<String, Object> deleteChatList(JSONObject object) {
        int total = 0;
        Map<String, Object> resultSet = new HashMap<>(16);
        try {
            if (object.getInteger("sendId") != null && object.getInteger("receiveId") != null) {
                int status;
                ChatExample chatExample = new ChatExample();
                ChatExample.Criteria criteria = chatExample.createCriteria();
                criteria.andSendIdEqualTo(object.getInteger("sendId"));
                criteria.andReceiveIdEqualTo(object.getInteger("receiveId"));
                ChatExample.Criteria criteria_or = chatExample.createCriteria();
                criteria_or.andSendIdEqualTo(object.getInteger("receiveId"));
                criteria_or.andReceiveIdEqualTo(object.getInteger("sendId"));
                chatExample.or(criteria_or);
                status = chatMapper.deleteByExample(chatExample);
                resultSet.put("status", 0);
                resultSet.put("message", "删除消息列表成功！");
                resultSet.put("total", total);
                resultSet.put("data", status);
            } else {
                resultSet.put("status", 0);
                resultSet.put("message", "删除消息列表失败！");
                resultSet.put("total", 0);
                resultSet.put("data", 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultSet.put("status", 100);
            resultSet.put("message", "删除消息列表错误！");
            resultSet.put("total", 0);
            resultSet.put("data", 0);
        }
        return resultSet;
    }

    @Override
    public Map<String, Object> deleteChat(JSONObject object) {
        int total = 0;
        Map<String, Object> resultSet = new HashMap<>(16);
        try {
            if (object.getInteger("chatId") != null) {
                int status;
                status = chatMapper.deleteByPrimaryKey(object.getInteger("chatId"));
                resultSet.put("status", 0);
                resultSet.put("message", "删除消息成功！");
                resultSet.put("total", total);
                resultSet.put("data", status);
            } else {
                resultSet.put("status", 0);
                resultSet.put("message", "删除消息失败！");
                resultSet.put("total", 0);
                resultSet.put("data", 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultSet.put("status", 100);
            resultSet.put("message", "删除消息错误！");
            resultSet.put("total", 0);
            resultSet.put("data", 0);
        }
        return resultSet;
    }

    @Override
    public Map<String, Object> updateChatByUser(JSONObject object) {
        int total = 0;
        Map<String, Object> resultSet = new HashMap<>(16);
        try {
            if (object.getInteger("sendId") != null && object.getInteger("receiveId") != null) {
                int status = 0;
                ChatExample chatExample = new ChatExample();
                ChatExample.Criteria criteria = chatExample.createCriteria();
                criteria.andSendIdEqualTo(object.getInteger("sendId"));
                criteria.andReceiveIdEqualTo(object.getInteger("receiveId"));
                criteria.andChatMesgEqualTo(0);
                List<Chat> chats = chatMapper.selectByExample(chatExample);
                for (Chat c : chats) {
                    c.setChatMesg(1);
                    status += chatMapper.updateByPrimaryKeySelective(c);
                }
                resultSet.put("status", 0);
                resultSet.put("message", "已读消息列表成功！");
                resultSet.put("total", total);
                resultSet.put("data", status);
            } else {
                resultSet.put("status", 0);
                resultSet.put("message", "已读消息列表失败！");
                resultSet.put("total", 0);
                resultSet.put("data", 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultSet.put("status", 100);
            resultSet.put("message", "已读消息列表错误！");
            resultSet.put("total", 0);
            resultSet.put("data", 0);
        }
        return resultSet;
    }
}
