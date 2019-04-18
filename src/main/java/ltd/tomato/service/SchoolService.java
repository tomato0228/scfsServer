package ltd.tomato.service;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public interface SchoolService {


    /**
     * 按用户查找学校信息
     *
     * @param object 用户的信息
     * @return 返回学校信息
     * @throws Exception 处理异常
     */
    Map<String, Object> getSchoolByUserId(JSONObject object) throws Exception;

}
