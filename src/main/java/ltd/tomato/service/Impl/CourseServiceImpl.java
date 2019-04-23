package ltd.tomato.service.Impl;

import com.alibaba.fastjson.JSONObject;
import ltd.tomato.mapper.*;
import ltd.tomato.model.*;
import ltd.tomato.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("Course")
public class CourseServiceImpl implements CourseService {

    @Autowired(required = false)
    CourseMapper courseMapper;
    @Autowired(required = false)
    UserMapper userMapper;
    @Autowired(required = false)
    StudentMapper studentMapper;
    @Autowired(required = false)
    ParentsMapper parentsMapper;
    @Autowired(required = false)
    TclassMapper tclassMapper;

    @Override
    public Map<String, Object> getCourseByUser(JSONObject object) throws Exception {
        int total = 0;
        Map<String, Object> resultSet = new HashMap<>(16);

        List<Course> courses = new ArrayList<>(16);
        try {
            CourseExample courseExample = new CourseExample();
            CourseExample.Criteria criteria = courseExample.createCriteria();
            //查询条件
            if (object.getInteger("userId") != null) {
                User user = userMapper.selectByPrimaryKey(object.getInteger("userId"));
                TclassExample tclassExample = new TclassExample();
                TclassExample.Criteria criteria_t = tclassExample.createCriteria();
                if (user.getUserType().equals("教师")) {
                    criteria_t.andTeacherIdEqualTo(user.getUserId());
                    criteria_t.andTclassValidationEqualTo("审核通过");
                } else {
                    if (user.getUserType().equals("家长")) {
                        user = userMapper.selectByPrimaryKey(parentsMapper.selectByPrimaryKey(user.getUserId()).getStudentId());
                    }
                    int classId = studentMapper.selectByPrimaryKey(user.getUserId()).getClassId();
                    criteria_t.andClassIdEqualTo(classId);
                    criteria_t.andTclassValidationEqualTo("审核通过");
                }
                List<Tclass> tclasses = tclassMapper.selectByExample(tclassExample);
                List<Integer> courseIds = new ArrayList<>();
                for (Tclass t : tclasses) {
                    if (!courseIds.contains(t.getCourseId())) {
                        courseIds.add(t.getCourseId());
                        courses.add(courseMapper.selectByPrimaryKey(t.getCourseId()));
                    }
                }
            }
            total = courses.size();
            resultSet.put("status", 0);
            resultSet.put("message", "获取课程列表成功！");
            resultSet.put("total", total);
            resultSet.put("data", courses);
        } catch (Exception e) {
            e.printStackTrace();
            resultSet.put("status", 100);
            resultSet.put("message", "获取课程列表错误！");
            resultSet.put("total", 0);
            resultSet.put("data", new ArrayList<>());
        }
        return resultSet;
    }
}
