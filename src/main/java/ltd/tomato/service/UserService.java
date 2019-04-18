package ltd.tomato.service;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public interface UserService {


    /**
     * ID，电话，邮箱登陆
     *
     * @param object 账号，密码
     * @return 返回登陆信息
     * @throws Exception 处理异常
     */
    Map<String, Object> getUserByLogin(JSONObject object) throws Exception;
}
