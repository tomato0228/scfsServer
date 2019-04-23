package ltd.tomato.service.Impl;

import com.alibaba.fastjson.JSONObject;
import ltd.tomato.mapper.*;
import ltd.tomato.model.*;
import ltd.tomato.service.HomeworkService;
import ltd.tomato.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

//import java.text.SimpleDateFormat;

@Service("Homework")
public class HomeworkServiceImpl implements HomeworkService {

    @Autowired(required = false)
    HomeworkViewMapper homeworkViewMapper;
    @Autowired(required = false)
    HomeworkMapper homeworkMapper;
    @Autowired(required = false)
    UserMapper userMapper;
    @Autowired(required = false)
    StudentMapper studentMapper;
    @Autowired(required = false)
    ParentsMapper parentsMapper;
    @Autowired(required = false)
    TclassMapper tclassMapper;

    @Override
    public Map<String, Object> getHomeworkByUser(JSONObject object) throws Exception {
        int total = 0;
        Map<String, Object> resultSet = new HashMap<>(16);
        List<HomeworkView> homeworkViews = new ArrayList<>(16);
        try {
            HomeworkViewExample homeworkViewExample = new HomeworkViewExample();
            HomeworkViewExample.Criteria criteria = homeworkViewExample.createCriteria();
            if (object.getInteger("userId") != null) {
                User user = userMapper.selectByPrimaryKey(object.getInteger("userId"));
                if (user.getUserType().equals("教师")) {
                    if (object.getInteger("classId") != null && object.getInteger("courseId") != null) {
                        criteria.andTeacherIdEqualTo(user.getUserId());
                        criteria.andClassIdEqualTo(object.getInteger("classId"));
                        criteria.andCourseIdEqualTo(object.getInteger("courseId"));
                        criteria.andTclassValidationEqualTo("审核通过");
                        homeworkViewExample.setOrderByClause("homework_date DESC");
                        homeworkViews = homeworkViewMapper.selectByExample(homeworkViewExample);
                    }
                } else {
                    if (user.getUserType().equals("家长")) {
                        user = userMapper.selectByPrimaryKey(parentsMapper.selectByPrimaryKey(user.getUserId()).getStudentId());
                    }
                    int classId = studentMapper.selectByPrimaryKey(user.getUserId()).getClassId();
                    criteria.andClassIdEqualTo(classId);
                    if (object.getInteger("courseId") != null) {
                        criteria.andCourseIdEqualTo(object.getInteger("courseId"));
                    }
                    homeworkViewExample.setOrderByClause("homework_date DESC");
                    homeworkViews = homeworkViewMapper.selectByExample(homeworkViewExample);
                }
            }
            total = homeworkViews.size();
            resultSet.put("status", 0);
            resultSet.put("message", "获取作业列表成功！");
            resultSet.put("total", total);
            resultSet.put("data", homeworkViews);
        } catch (Exception e) {
            e.printStackTrace();
            resultSet.put("status", 100);
            resultSet.put("message", "获取作业列表错误！");
            resultSet.put("total", 0);
            resultSet.put("data", new ArrayList<>());
        }
        return resultSet;
    }

    @Override
    public Map<String, Object> addHomeworkByTeacher(JSONObject object) {
        int total = 0;
        Map<String, Object> resultSet = new HashMap<>(16);
        int status = 0;
        try {
            if (object.getInteger("userId") != null && object.getInteger("classId") != null && object.getInteger("courseId") != null && !StringUtil.isNULLOREmpty(object.getString("homeworkContent"))) {
                User user = userMapper.selectByPrimaryKey(object.getInteger("userId"));
                if (user.getUserType().equals("教师")) {
                    TclassExample tclassExample = new TclassExample();
                    TclassExample.Criteria criteria = tclassExample.createCriteria();
                    Tclass tclass;
                    criteria.andTeacherIdEqualTo(user.getUserId());
                    criteria.andClassIdEqualTo(object.getInteger("classId"));
                    criteria.andCourseIdEqualTo(object.getInteger("courseId"));
                    tclass = tclassMapper.selectByExample(tclassExample).get(0);
                    Homework homework = new Homework();
                    homework.setTclassId(tclass.getTclassId());
                    homework.setHomeworkContent(object.getString("homeworkContent"));
                    if (StringUtil.isNULLOREmpty(object.getString("homeworkAttachment"))) {
                        homework.setHomeworkAttachment("");
                    } else {
                        homework.setHomeworkAttachment(object.getString("homeworkAttachment"));
                    }
                    homework.setHomeworkDate(new Date());
//                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//                    System.out.println(df.format(homework.getHomeworkDate()));// new Date()为获取当前系统时间
                    homeworkMapper.insertSelective(homework);
                    status = homework.getHomeworkId();
                }
            }
            resultSet.put("status", 0);
            resultSet.put("message", "增加作业成功！");
            resultSet.put("total", total);
            resultSet.put("data", status);
        } catch (Exception e) {
            e.printStackTrace();
            resultSet.put("status", 100);
            resultSet.put("message", "增加作业错误！");
            resultSet.put("total", 0);
            resultSet.put("data", String.valueOf(0));
        }
        return resultSet;
    }

    @Override
    public Map<String, Object> deleteHomeworkByTeacher(JSONObject object) {
        int total = 0;
        Map<String, Object> resultSet = new HashMap<>(16);
        int status = 0;
        try {
            if (object.getInteger("homeworkId") != null) {
                status = homeworkMapper.deleteByPrimaryKey(object.getInteger("homeworkId"));
            }
            resultSet.put("status", 0);
            resultSet.put("message", "删除作业成功！");
            resultSet.put("total", total);
            resultSet.put("data", String.valueOf(status));
        } catch (Exception e) {
            e.printStackTrace();
            resultSet.put("status", 100);
            resultSet.put("message", "删除作业错误！");
            resultSet.put("total", 0);
            resultSet.put("data", String.valueOf(0));
        }
        return resultSet;
    }

    @Override
    public Map<String, Object> editHomeworkByTeacher(JSONObject object) {
        int total = 0;
        Map<String, Object> resultSet = new HashMap<>(16);
        int status = 0;
        try {
            if (object.getInteger("homeworkId") != null) {
                Homework homework = homeworkMapper.selectByPrimaryKey(object.getInteger("homeworkId"));
                if (!StringUtil.isNULLOREmpty(object.getString("homeworkContent")) && !homework.getHomeworkContent().equals(object.getString("homeworkContent"))) {
                    homework.setHomeworkContent(object.getString("homeworkContent"));
                }
                if (!StringUtil.isNULLOREmpty(object.getString("homeworkAttachment")) && !homework.getHomeworkAttachment().equals(object.getString("homeworkAttachment"))) {
                    homework.setHomeworkAttachment(object.getString("homeworkAttachment"));
                }
                status = homeworkMapper.updateByPrimaryKeySelective(homework);
            }
            resultSet.put("status", 0);
            resultSet.put("message", "编辑作业成功！");
            resultSet.put("total", total);
            resultSet.put("data", String.valueOf(status));
        } catch (Exception e) {
            e.printStackTrace();
            resultSet.put("status", 100);
            resultSet.put("message", "编辑作业错误！");
            resultSet.put("total", 0);
            resultSet.put("data", String.valueOf(0));
        }
        return resultSet;
    }
}
