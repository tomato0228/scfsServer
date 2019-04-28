package ltd.tomato.service.Impl;

import com.alibaba.fastjson.JSONObject;
import ltd.tomato.mapper.*;
import ltd.tomato.model.*;
import ltd.tomato.service.NoticeService;
import ltd.tomato.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("Notice")
public class NoticeServiceImpl implements NoticeService {

    @Autowired(required = false)
    NoticeMapper noticeMapper;
    @Autowired(required = false)
    NoticeViewMapper noticeViewMapper;
    @Autowired(required = false)
    UserMapper userMapper;
    @Autowired(required = false)
    StudentMapper studentMapper;
    @Autowired(required = false)
    ParentsMapper parentsMapper;

    @Override
    public Map<String, Object> getNoticeByUser(JSONObject object) {
        int total = 0;
        Map<String, Object> resultSet = new HashMap<>(16);

        List<NoticeView> noticeViews = new ArrayList<>(16);
        try {
            NoticeViewExample noticeViewExample = new NoticeViewExample();
            NoticeViewExample.Criteria criteria = noticeViewExample.createCriteria();
            //查询条件
            if (object.getInteger("userId") != null) {
                User user = userMapper.selectByPrimaryKey(object.getInteger("userId"));
                if (user.getUserType().equals("教师")) {
                    if (object.getInteger("classId") != null) {
                        criteria.andUserIdEqualTo(user.getUserId());
                        criteria.andClassIdEqualTo(object.getInteger("classId"));
                        noticeViewExample.setOrderByClause("notice_date DESC");
                        noticeViews = noticeViewMapper.selectByExample(noticeViewExample);
                    }
                } else {
                    if (user.getUserType().equals("家长")) {
                        ParentsExample parentsExample = new ParentsExample();
                        ParentsExample.Criteria criteria_p = parentsExample.createCriteria();
                        criteria_p.andParentsIdEqualTo(user.getUserId());
                        criteria_p.andStudentIdEqualTo(object.getInteger("studentId"));
                        user = userMapper.selectByPrimaryKey(parentsMapper.selectByExample(parentsExample).get(0).getStudentId());
                    }
                    int classId = studentMapper.selectByPrimaryKey(user.getUserId()).getClassId();
                    criteria.andClassIdEqualTo(classId);
                    noticeViewExample.setOrderByClause("notice_date DESC");
                    noticeViews = noticeViewMapper.selectByExample(noticeViewExample);
                }
            }
            total = noticeViews.size();
            resultSet.put("status", 0);
            resultSet.put("message", "获取通知列表成功！");
            resultSet.put("total", total);
            resultSet.put("data", noticeViews);
        } catch (Exception e) {
            e.printStackTrace();
            resultSet.put("status", 100);
            resultSet.put("message", "获取通知列表错误！");
            resultSet.put("total", 0);
            resultSet.put("data", null);
        }
        return resultSet;
    }

    @Override
    public Map<String, Object> addNoticeByTeacher(JSONObject object) {
        int total = 0;
        Map<String, Object> resultSet = new HashMap<>(16);
        int status = 0;
        try {
            if (object.getInteger("userId") != null && object.getInteger("classId") != null && !StringUtil.isNULLOREmpty(object.getString("noticeTitle")) && !StringUtil.isNULLOREmpty(object.getString("noticeContent"))) {
                User user = userMapper.selectByPrimaryKey(object.getInteger("userId"));
                if (user.getUserType().equals("教师")) {
                    Notice notice = new Notice();
                    notice.setUserId(user.getUserId());
                    notice.setClassId(object.getInteger("classId"));
                    notice.setNoticeTitle(object.getString("noticeTitle"));
                    notice.setNoticeContent(object.getString("noticeContent"));
                    if (StringUtil.isNULLOREmpty(object.getString("noticeAttachment"))) {
                        notice.setNoticeAttachment("");
                    } else {
                        notice.setNoticeAttachment(object.getString("noticeAttachment"));
                    }
                    notice.setNoticeDate(new Date());
                    noticeMapper.insertSelective(notice);
                    status = notice.getNoticeId();
                }
            }
            resultSet.put("status", 0);
            resultSet.put("message", "增加通知成功！");
            resultSet.put("total", total);
            resultSet.put("data", status);
        } catch (Exception e) {
            e.printStackTrace();
            resultSet.put("status", 100);
            resultSet.put("message", "增加通知错误！");
            resultSet.put("total", 0);
            resultSet.put("data", 0);
        }
        return resultSet;
    }

    @Override
    public Map<String, Object> deleteNoticeByTeacher(JSONObject object) {
        int total = 0;
        Map<String, Object> resultSet = new HashMap<>(16);
        int status = 0;
        try {
            if (object.getInteger("noticeId") != null) {
                status = noticeMapper.deleteByPrimaryKey(object.getInteger("noticeId"));
            }
            resultSet.put("status", 0);
            resultSet.put("message", "删除通知成功！");
            resultSet.put("total", total);
            resultSet.put("data", status);
        } catch (Exception e) {
            e.printStackTrace();
            resultSet.put("status", 100);
            resultSet.put("message", "删除通知错误！");
            resultSet.put("total", 0);
            resultSet.put("data", 0);
        }
        return resultSet;
    }

    @Override
    public Map<String, Object> editNoticeByTeacher(JSONObject object) {
        int total = 0;
        Map<String, Object> resultSet = new HashMap<>(16);
        int status = 0;
        try {
            if (object.getInteger("noticeId") != null) {
                Notice notice = noticeMapper.selectByPrimaryKey(object.getInteger("noticeId"));
                if (!StringUtil.isNULLOREmpty(object.getString("noticeTitle")) && !notice.getNoticeTitle().equals(object.getString("noticeTitle"))) {
                    notice.setNoticeTitle(object.getString("noticeTitle"));
                }
                if (!StringUtil.isNULLOREmpty(object.getString("noticeContent")) && !notice.getNoticeContent().equals(object.getString("noticeContent"))) {
                    notice.setNoticeContent(object.getString("noticeContent"));
                }
                if (!StringUtil.isNULLOREmpty(object.getString("noticeAttachment")) && !notice.getNoticeAttachment().equals(object.getString("noticeAttachment"))) {
                    notice.setNoticeAttachment(object.getString("noticeAttachment"));
                }
                status = noticeMapper.updateByPrimaryKeySelective(notice);
            }
            resultSet.put("status", 0);
            resultSet.put("message", "编辑通知成功！");
            resultSet.put("total", total);
            resultSet.put("data", status);
        } catch (Exception e) {
            e.printStackTrace();
            resultSet.put("status", 100);
            resultSet.put("message", "编辑通知错误！");
            resultSet.put("total", 0);
            resultSet.put("data", 0);
        }
        return resultSet;
    }
}
