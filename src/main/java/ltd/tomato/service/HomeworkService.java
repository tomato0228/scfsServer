package ltd.tomato.service;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public interface HomeworkService {


    /**
     * 按用户ID查找作业列表
     *
     * @param object 教师：用户ID、班级ID、课程ID，学生/家长：用户ID
     * @return 返回作业列表
     * @throws Exception 处理异常
     */
    Map<String, Object> getHomeworkByUser(JSONObject object) throws Exception;

}
