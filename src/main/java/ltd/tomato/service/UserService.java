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

    /**
     * 注册
     *
     * @param object 用户信息
     * @return 返回信息
     * @throws Exception 处理异常
     */
    Map<String, Object> addUserBySignin(JSONObject object) throws Exception;

    /**
     * 验证手机号码或邮箱是否存在
     *
     * @param object 手机号码或邮箱
     * @return 返回信息
     * @throws Exception 处理异常
     */
    Map<String, Object> verifyUserAcc(JSONObject object) throws Exception;

    /**
     * 修改
     *
     * @param object 用户信息
     * @return 返回信息
     * @throws Exception 处理异常
     */
    Map<String, Object> updateUser(JSONObject object) throws Exception;

    /**
     * 发送验证码
     *
     * @param object 手机号码或邮箱
     * @return 返回信息
     * @throws Exception 处理异常
     */
    Map<String, Object> sendValidationCode(JSONObject object) throws Exception;

    /**
     * 搜索联系人
     *
     * @param object 用户ID，关键词，是不是添加家长
     * @return 返回信息
     * @throws Exception 处理异常
     */
    Map<String, Object> searchUser(JSONObject object) throws Exception;

    /**
     * 添加家长
     *
     * @param object 用户ID，家长ID，关系
     * @return 返回信息
     * @throws Exception 处理异常
     */
    Map<String, Object> addParents(JSONObject object) throws Exception;

    /**
     * 家长获取学生列表
     *
     * @param object 用户ID
     * @return 返回信息
     * @throws Exception 处理异常
     */
    Map<String, Object> getStudentList(JSONObject object) throws Exception;
}
