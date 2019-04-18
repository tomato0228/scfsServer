package ltd.tomato.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import ltd.tomato.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping(value = "/**/User")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/login")
    @ResponseBody
    public JSONObject getReplenishList(@RequestParam Map map) throws Exception {
        System.out.println(map.toString());
        JSONObject obj = JSONObject.parseObject(JSON.toJSONString(map));
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        return JSONObject.parseObject(JSON.toJSONString(userService.getUserByLogin(obj), SerializerFeature.WriteDateUseDateFormat));
    }
}
