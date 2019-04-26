package ltd.tomato.service.Impl;

import com.alibaba.fastjson.JSONObject;
import ltd.tomato.mapper.ParentsMapper;
import ltd.tomato.mapper.UserMapper;
import ltd.tomato.model.Parents;
import ltd.tomato.model.User;
import ltd.tomato.model.UserExample;
import ltd.tomato.service.UserService;
import ltd.tomato.utils.Password;
import ltd.tomato.utils.RegUtil;
import ltd.tomato.utils.StringUtil;
import ltd.tomato.utils.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("User")
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    UserMapper userMapper;
    @Autowired(required = false)
    ParentsMapper parentsMapper;

    @Override
    public Map<String, Object> getUserByLogin(JSONObject object) {
        Map<String, Object> resultSet = new HashMap<>(16);
        User user = null;
        try {
            UserExample userExample = new UserExample();
            UserExample.Criteria criteria = userExample.createCriteria();
            String username = object.getString("username");
            String password = object.getString("password");
            //查询条件
            if (username != null) {
                // 电话号码
                if (RegUtil.isMatche(username, RegUtil.REG_MOBILE_TELEPHONE)) {
                    criteria.andUserTelEqualTo(username);
                    user = userMapper.selectByExample(userExample).get(0);
                } else if (RegUtil.isEmail(username)) {
                    criteria.andUserEmailEqualTo(username);
                    user = userMapper.selectByExample(userExample).get(0);
                } else if (RegUtil.isNumeric(username)) {
                    int userId = Integer.parseInt(username);
                    user = userMapper.selectByPrimaryKey(userId);
                }
            }
            if (user != null && Password.md5(password).equals(user.getUserPassword())) {
                int total = 1;
                if (user.getUserType().equals("家长") && parentsMapper.selectByPrimaryKey(user.getUserId()) == null) {
                    total = 0;
                }
                resultSet.put("status", 0);
                resultSet.put("message", "登陆成功！");
                resultSet.put("total", total);
                resultSet.put("data", user);
            } else {
                resultSet.put("status", 1);
                resultSet.put("message", "登陆失败！");
                resultSet.put("total", 0);
                resultSet.put("data", null);
            }
        } catch (Exception e) {
            resultSet.put("status", 100);
            resultSet.put("message", "登陆异常！");
            resultSet.put("total", 0);
            resultSet.put("data", null);
        }
        return resultSet;
    }

    @Override
    public Map<String, Object> addUserBySignin(JSONObject object) {
        Map<String, Object> resultSet = new HashMap<>(16);
        try {
            if (!StringUtil.isNULLOREmpty(object.getString("userName"))
                    && !StringUtil.isNULLOREmpty(object.getString("userType"))
                    && !StringUtil.isNULLOREmpty(object.getString("userSex"))
                    && !StringUtil.isNULLOREmpty(object.getString("userPassword"))
                    && !StringUtil.isNULLOREmpty(object.getString("userBirth"))) {
                int data;
                User user = new User();
                user.setUserName(object.getString("userName"));
                user.setUserType(object.getString("userType"));
                user.setUserSex(object.getString("userSex"));
                user.setUserPassword(Password.md5(object.getString("userPassword")));
                user.setUserBirth(TimeUtil.dateFormatYMD(object.getString("userBirth")));
                user.setUserDate(new Date());
                userMapper.insertSelective(user);
                data = user.getUserId();
                int total = 1;
                resultSet.put("status", 0);
                resultSet.put("message", "注册成功！");
                resultSet.put("total", total);
                resultSet.put("data", data);
            } else {
                resultSet.put("status", 1);
                resultSet.put("message", "注册失败！");
                resultSet.put("total", 0);
                resultSet.put("data", 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultSet.put("status", 100);
            resultSet.put("message", "注册错误！");
            resultSet.put("total", 0);
            resultSet.put("data", 0);
        }
        return resultSet;
    }

    @Override
    public Map<String, Object> verifyUserAcc(JSONObject object) {
        Map<String, Object> resultSet = new HashMap<>(16);
        try {
            if (!StringUtil.isNULLOREmpty(object.getString("userAcc"))) {
                int total = 0;
                int data;
                UserExample userExample = new UserExample();
                UserExample.Criteria criteria = userExample.createCriteria();
                if (RegUtil.isEmail(object.getString("userAcc"))) {
                    criteria.andUserEmailEqualTo(object.getString("userAcc"));
                } else if (RegUtil.isMatche(object.getString("userAcc"), RegUtil.REG_MOBILE_TELEPHONE)) {
                    criteria.andUserTelEqualTo(object.getString("userAcc"));
                }
                List<User> users = userMapper.selectByExample(userExample);
                if (users != null) {
                    total = users.size();
                }
                data = total;
                resultSet.put("status", 0);
                resultSet.put("message", "验证成功！");
                resultSet.put("total", total);
                resultSet.put("data", data);
            } else {
                resultSet.put("status", 1);
                resultSet.put("message", "验证失败！");
                resultSet.put("total", 0);
                resultSet.put("data", 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultSet.put("status", 100);
            resultSet.put("message", "验证错误！");
            resultSet.put("total", 0);
            resultSet.put("data", 0);
        }
        return resultSet;
    }

    @Override
    public Map<String, Object> updateUser(JSONObject object) {
        Map<String, Object> resultSet = new HashMap<>(16);
        try {
            if (object.getInteger("userId") != null) {
                User user = userMapper.selectByPrimaryKey(object.getInteger("userId"));
                if (!StringUtil.isNULLOREmpty(object.getString("userName"))) {
                    user.setUserName(object.getString("userName"));
                }
                if (!StringUtil.isNULLOREmpty(object.getString("userPassword"))) {
                    user.setUserPassword(Password.md5(object.getString("userPassword")));
                }
                if (!StringUtil.isNULLOREmpty(object.getString("userBirth"))) {
                    user.setUserBirth(TimeUtil.dateFormatYMD(object.getString("userBirth")));
                }
                if (!StringUtil.isNULLOREmpty(object.getString("userSex"))) {
                    user.setUserSex(object.getString("userSex"));
                }
                if (!StringUtil.isNULLOREmpty(object.getString("userTel"))) {
                    user.setUserTel(object.getString("userTel"));
                }
                if (!StringUtil.isNULLOREmpty(object.getString("userAddr"))) {
                    user.setUserAddr(object.getString("userAddr"));
                }
                if (!StringUtil.isNULLOREmpty(object.getString("userType"))) {
                    user.setUserType(object.getString("userType"));
                }
                if (!StringUtil.isNULLOREmpty(object.getString("userEmail"))) {
                    user.setUserEmail(object.getString("userEmail"));
                }
                if (!StringUtil.isNULLOREmpty(object.getString("userProfile"))) {
                    user.setUserProfile(object.getString("userProfile"));
                }
                if (!StringUtil.isNULLOREmpty(object.getString("userSignature"))) {
                    user.setUserSignature(object.getString("userSignature"));
                }
                userMapper.updateByPrimaryKeySelective(user);
                int total = 1;
                resultSet.put("status", 0);
                resultSet.put("message", "修改成功！");
                resultSet.put("total", total);
                resultSet.put("data", user);
            } else {
                resultSet.put("status", 1);
                resultSet.put("message", "修改失败！");
                resultSet.put("total", 0);
                resultSet.put("data", 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultSet.put("status", 100);
            resultSet.put("message", "修改错误！");
            resultSet.put("total", 0);
            resultSet.put("data", 0);
        }
        return resultSet;
    }

    @Override
    public Map<String, Object> sendValidationCode(JSONObject object) {
        Map<String, Object> resultSet = new HashMap<>(16);
        try {
            if (object.getInteger("userId") != null && !StringUtil.isNULLOREmpty(object.getString("validationAcc"))) {
                // TODO 获取验证码
                int data = 655234;
                if (RegUtil.isMatche(object.getString("validationAcc"), RegUtil.REG_MOBILE_TELEPHONE)) {
                    // TODO 发送验证码给用户电话号码

                } else if (RegUtil.isEmail(object.getString("validationAcc"))) {
                    // TODO 发送验证码给用户邮箱

                }
                int total = 1;
                resultSet.put("status", 0);
                resultSet.put("message", "获取验证成功！");
                resultSet.put("total", total);
                resultSet.put("data", data);
            } else {
                resultSet.put("status", 1);
                resultSet.put("message", "获取验证失败！");
                resultSet.put("total", 0);
                resultSet.put("data", 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultSet.put("status", 100);
            resultSet.put("message", "获取验证错误！");
            resultSet.put("total", 0);
            resultSet.put("data", 0);
        }
        return resultSet;
    }
}
