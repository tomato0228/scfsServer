package ltd.tomato.service.Impl;

import com.alibaba.fastjson.JSONObject;
import ltd.tomato.mapper.*;
import ltd.tomato.model.*;
import ltd.tomato.service.ChatService;
import ltd.tomato.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("Chat")
public class ChatServiceImpl implements ChatService {
    @Autowired(required = false)
    ChatMapper chatMapper;
    @Autowired(required = false)
    ChatViewMapper chatViewMapper;
    @Autowired(required = false)
    UserMapper userMapper;
    @Autowired(required = false)
    StudentMapper studentMapper;
    @Autowired(required = false)
    ParentsMapper parentsMapper;
    @Autowired(required = false)
    TeacherMapper teacherMapper;
    @Autowired(required = false)
    TclassMapper tclassMapper;
    @Autowired(required = false)
    ClassMapper classMapper;

    @Override
    public Map<String, Object> getChatList(JSONObject object) {
        int total = 0;
        Map<String, Object> resultSet = new HashMap<>(16);
        List<ChatView> chatViews;
        try {
            ChatViewExample chatViewExample = new ChatViewExample();
            ChatViewExample.Criteria criteria = chatViewExample.createCriteria();
            if (object.getInteger("sendId") != null && object.getInteger("receiveId") != null) {
                List<Integer> userIds = new ArrayList<>(16);
                userIds.add(object.getInteger("sendId"));
                userIds.add(object.getInteger("receiveId"));
                criteria.andSendIdIn(userIds);
                criteria.andReceiveIdIn(userIds);
                if (object.getInteger("chatMesg") != null && object.getInteger("chatMesg") == 0) {
                    criteria.andChatMesgEqualTo(0);
                }
                chatViewExample.setOrderByClause("chat_date DESC");
                chatViews = chatViewMapper.selectByExample(chatViewExample);
                total = chatViews.size();
                resultSet.put("status", 0);
                resultSet.put("message", "获取消息列表成功！");
                resultSet.put("total", total);
                resultSet.put("data", chatViews);
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
    public Map<String, Object> getChatContactsByUser(JSONObject object) {
        int total = 0;
        Map<String, Object> resultSet = new HashMap<>(16);
        List<User> users;
        try {
            if (object.getInteger("userId") != null) {
                User user = userMapper.selectByPrimaryKey(object.getInteger("userId"));
                ChatExample chatExample = new ChatExample();
                ChatExample.Criteria criteria = chatExample.createCriteria();
                ChatExample.Criteria criteria_or = chatExample.createCriteria();
                criteria.andSendIdEqualTo(user.getUserId());
                criteria_or.andReceiveIdEqualTo(user.getUserId());
                chatExample.or(criteria_or);
                List<Chat> chats;
                chats = chatMapper.selectByExample(chatExample);
                List<Integer> userIds = new ArrayList<>(16);
                for (Chat c : chats) {
                    if (c.getSendId().equals(user.getUserId())) {
                        if (!userIds.contains(c.getReceiveId()) && !c.getReceiveId().equals(user.getUserId())) {
                            userIds.add(c.getReceiveId());
                        }
                    } else if (c.getReceiveId().equals(user.getUserId())) {
                        if (!userIds.contains(c.getSendId()) && !c.getSendId().equals(user.getUserId())) {
                            userIds.add(c.getSendId());
                        }
                    }
                }
                UserExample userExample = new UserExample();
                UserExample.Criteria criteria_u = userExample.createCriteria();
                criteria_u.andUserIdIn(userIds);
                users = userMapper.selectByExample(userExample);
                total = users.size();
                resultSet.put("status", 0);
                resultSet.put("message", "获取已聊天联系人列表成功！");
                resultSet.put("total", total);
                resultSet.put("data", users);
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
        List<User> users;
        try {
            if (object.getInteger("userId") != null && !StringUtil.isNULLOREmpty(object.getString("contactsType"))) {
                User user = userMapper.selectByPrimaryKey(object.getInteger("userId"));
                Integer classId;
                List<Integer> userIds = new ArrayList<>(16);
                if (user.getUserType().equals("教师")) {
                    classId = object.getInteger("classId");
                } else if (user.getUserType().equals("家长")) {
                    classId = studentMapper.selectByPrimaryKey(parentsMapper.selectByPrimaryKey(user.getUserId()).getParentsId()).getClassId();
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
                        if (!teacherIds.contains(t.getTeacherId()) && !t.getTclassId().equals(user.getUserId())) {
                            teacherIds.add(t.getTeacherId());
                        }
                    }
                    criteria.andUserIdIn(teacherIds);
                    users = userMapper.selectByExample(userExample);
                } else {
                    StudentExample studentExample = new StudentExample();
                    StudentExample.Criteria criteria_s = studentExample.createCriteria();
                    criteria_s.andClassIdEqualTo(classId);
                    List<Student> students = studentMapper.selectByExample(studentExample);
                    for (Student s : students) {
                        if (!userIds.contains(s.getStudentId()) && !s.getStudentId().equals(user.getUserId())) {
                            userIds.add(s.getStudentId());
                        }
                    }
                    if (object.getString("contactsType").equals("家长")) {
                        ParentsExample parentsExample = new ParentsExample();
                        ParentsExample.Criteria criteria_p = parentsExample.createCriteria();
                        criteria_p.andStudentIdIn(userIds);
                        List<Parents> parents = parentsMapper.selectByExample(parentsExample);
                        userIds.clear();
                        for (Parents p : parents) {
                            if (!userIds.contains(p.getParentsId()) && !p.getParentsId().equals(user.getUserId())) {
                                userIds.add(p.getParentsId());
                            }
                        }
                    }
                    criteria.andUserIdIn(userIds);
                    users = userMapper.selectByExample(userExample);
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
        return null;
    }

    @Override
    public Map<String, Object> deleteChatList(JSONObject object) {
        return null;
    }

    @Override
    public Map<String, Object> deleteChat(JSONObject object) {
        return null;
    }
}
