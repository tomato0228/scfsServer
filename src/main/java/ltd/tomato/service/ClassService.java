package ltd.tomato.service;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public interface ClassService {
    /**
     * 按用户ID查找班级
     *
     * @param object 用户ID
     * @return 返回班级列表
     * @throws Exception 处理异常
     */
    Map<String, Object> getClassByUser(JSONObject object) throws Exception;

}
