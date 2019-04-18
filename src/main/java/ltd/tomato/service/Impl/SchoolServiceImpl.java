package ltd.tomato.service.Impl;

import com.alibaba.fastjson.JSONObject;
import ltd.tomato.mapper.*;
import ltd.tomato.model.Class;
import ltd.tomato.model.*;
import ltd.tomato.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("School")
public class SchoolServiceImpl implements SchoolService {

    @Autowired(required = false)
    SchoolMapper schoolMapper;
    @Autowired(required = false)
    UserMapper userMapper;
    @Autowired(required = false)
    StudentMapper studentMapper;
    @Autowired(required = false)
    TeacherMapper teacherMapper;
    @Autowired(required = false)
    ParentsMapper parentsMapper;
    @Autowired(required = false)
    ClassMapper classMapper;
    @Autowired(required = false)
    MajorMapper majorMapper;
    @Autowired(required = false)
    CollegeMapper collegeMapper;

    @Override
    public Map<String, Object> getSchoolByUserId(JSONObject object) throws Exception {
        int total = 0;
        Map<String, Object> resultSet = new HashMap<>(16);

        List<School> schools = new ArrayList<>(16);
        School school = null;
        College college = null;
        Major major = null;
        Class c = null;
        try {
            SchoolExample schoolExample = new SchoolExample();
            SchoolExample.Criteria criteria = schoolExample.createCriteria();
            //查询条件
            if (object.getInteger("userId") != null) {
                User user = userMapper.selectByPrimaryKey(object.getInteger("userId"));
                if (user.getUserType().equals("教师")) {
                    Teacher teacher = teacherMapper.selectByPrimaryKey(user.getUserId());
                    major = majorMapper.selectByPrimaryKey(teacher.getMajorId());
                    college = collegeMapper.selectByPrimaryKey(major.getCollegeId());
                    school = schoolMapper.selectByPrimaryKey(college.getSchoolId());
                } else {
                    Student student = null;
                    if (user.getUserType().equals("学生")) {
                        student = studentMapper.selectByPrimaryKey(user.getUserId());
                    } else if (user.getUserType().equals("家长")) {
                        student = studentMapper.selectByPrimaryKey(parentsMapper.selectByPrimaryKey(user.getUserId()).getStudentId());
                    }
                    if (student != null) {
                        c = classMapper.selectByPrimaryKey(student.getClassId());
                        major = majorMapper.selectByPrimaryKey(c.getMajorId());
                        college = collegeMapper.selectByPrimaryKey(major.getCollegeId());
                        school = schoolMapper.selectByPrimaryKey(college.getSchoolId());
                    }
                }
            }
            if (school != null) {
                schools.add(school);
                total = 1;
            }
            resultSet.put("status", 0);
            resultSet.put("message", "获取学校信息成功！");
            resultSet.put("total", total);
            resultSet.put("data", schools);
        } catch (Exception e) {
            resultSet.put("status", 100);
            resultSet.put("message", "获取学校信息错误！");
            resultSet.put("total", 0);
            resultSet.put("data", null);
        }
        return resultSet;
    }
}
