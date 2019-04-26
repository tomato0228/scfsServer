package ltd.tomato.service;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public interface CourseService {
    /**
     * 按用户ID查找课程列表
     *
     * @param object 用户ID
     * @return 返回课程列表
     * @throws Exception 处理异常
     */
    Map<String, Object> getCourseByUser(JSONObject object) throws Exception;

}
