package ltd.tomato.service.Impl;

import com.alibaba.fastjson.JSONObject;
import ltd.tomato.mapper.*;
import ltd.tomato.model.Class;
import ltd.tomato.model.*;
import ltd.tomato.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("Class")
public class ClassServiceImpl implements ClassService {

    @Autowired(required = false)
    ClassMapper classMapper;
    @Autowired(required = false)
    UserMapper userMapper;
    @Autowired(required = false)
    StudentMapper studentMapper;
    @Autowired(required = false)
    ParentsMapper parentsMapper;
    @Autowired(required = false)
    TclassMapper tclassMapper;

    @Override
    public Map<String, Object> getClassByUser(JSONObject object) throws Exception {
        int total = 0;
        Map<String, Object> resultSet = new HashMap<>(16);

        List<Class> classes = new ArrayList<>(16);
        try {
            ClassExample classExample = new ClassExample();
            ClassExample.Criteria criteria = classExample.createCriteria();
            //查询条件
            if (object.getInteger("userId") != null) {
                User user = userMapper.selectByPrimaryKey(object.getInteger("userId"));
                TclassExample tclassExample = new TclassExample();
                TclassExample.Criteria criteria_t = tclassExample.createCriteria();
                criteria_t.andTeacherIdEqualTo(user.getUserId());
                criteria_t.andTclassValidationEqualTo("审核通过");
                List<Tclass> tclasses = tclassMapper.selectByExample(tclassExample);
                List<Integer> classIds = new ArrayList<>();
                for (Tclass t : tclasses) {
                    if (!classIds.contains(t.getClassId())) {
                        classIds.add(t.getClassId());
                        classes.add(classMapper.selectByPrimaryKey(t.getClassId()));
                    }
                }
            }
            total = classes.size();
            resultSet.put("status", 0);
            resultSet.put("message", "获取班级列表成功！");
            resultSet.put("total", total);
            resultSet.put("data", classes);
        } catch (Exception e) {
            e.printStackTrace();
            resultSet.put("status", 100);
            resultSet.put("message", "获取班级列表错误！");
            resultSet.put("total", 0);
            resultSet.put("data", new ArrayList<>());
        }
        return resultSet;
    }
}
