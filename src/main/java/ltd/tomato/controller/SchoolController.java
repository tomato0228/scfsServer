package ltd.tomato.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import ltd.tomato.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping(value = "/**/School")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @PostMapping(value = "/getSchool")
    @ResponseBody
    public JSONObject getSchool(@RequestParam Map map) throws Exception {
        System.out.println(map.toString());
        JSONObject obj = JSONObject.parseObject(JSON.toJSONString(map));
        return JSONObject.parseObject(JSON.toJSONString(schoolService.getSchoolByUserId(obj)));
    }

}
