package ltd.tomato.service.Impl;

import com.alibaba.fastjson.JSONObject;
import ltd.tomato.mapper.HomeworkViewMapper;
import ltd.tomato.mapper.ParentsMapper;
import ltd.tomato.mapper.StudentMapper;
import ltd.tomato.mapper.UserMapper;
import ltd.tomato.model.HomeworkView;
import ltd.tomato.model.HomeworkViewExample;
import ltd.tomato.model.TclassExample;
import ltd.tomato.model.User;
import ltd.tomato.service.HomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("Homework")
public class HomeworkServiceImpl implements HomeworkService {

    @Autowired(required = false)
    HomeworkViewMapper homeworkViewMapper;
    @Autowired(required = false)
    UserMapper userMapper;
    @Autowired(required = false)
    StudentMapper studentMapper;
    @Autowired(required = false)
    ParentsMapper parentsMapper;

    @Override
    public Map<String, Object> getHomeworkByUser(JSONObject object) throws Exception {
        int total = 0;
        Map<String, Object> resultSet = new HashMap<>(16);

        List<HomeworkView> homeworkViews = new ArrayList<>(16);
        try {
            HomeworkViewExample homeworkViewExample = new HomeworkViewExample();
            HomeworkViewExample.Criteria criteria = homeworkViewExample.createCriteria();
            //查询条件
            if (object.getInteger("userId") != null) {
                User user = userMapper.selectByPrimaryKey(object.getInteger("userId"));
                if (user.getUserType().equals("教师")) {
                    if (object.getInteger("classId") != null && object.getInteger("courseId") != null) {
                        criteria.andTeacherIdEqualTo(user.getUserId());
                        criteria.andClassIdEqualTo(object.getInteger("classId"));
                        criteria.andCourseIdEqualTo(object.getInteger("courseId"));
                        criteria.andTclassValidationEqualTo("审核通过");
                        homeworkViews = homeworkViewMapper.selectByExample(homeworkViewExample);
                    }
                } else {
                    if (user.getUserType().equals("家长")) {
                        user = userMapper.selectByPrimaryKey(parentsMapper.selectByPrimaryKey(user.getUserId()).getStudentId());
                    }
                    int classId = studentMapper.selectByPrimaryKey(user.getUserId()).getClassId();
                    criteria.andClassIdEqualTo(classId);
                    if (object.getInteger("courseId") != null){
                        criteria.andCourseIdEqualTo(object.getInteger("courseId"));
                    }
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
        System.out.println(resultSet);
        return resultSet;
    }
}
