package ltd.tomato.service.Impl;

import com.alibaba.fastjson.JSONObject;
import ltd.tomato.mapper.UserMapper;
import ltd.tomato.model.User;
import ltd.tomato.model.UserExample;
import ltd.tomato.service.UserService;
import ltd.tomato.utils.Password;
import ltd.tomato.utils.RegUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("User")
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    UserMapper userMapper;

    @Override
    public Map<String, Object> getUserByLogin(JSONObject object) throws Exception {
        int total = 0;
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
                total = 1;
                resultSet.put("status", 0);
                resultSet.put("message", "登陆成功！");
                resultSet.put("total", total);
                resultSet.put("data", user);
            } else {
                resultSet.put("status", 1);
                resultSet.put("message", "登陆失败！");
                resultSet.put("total", total);
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
}
