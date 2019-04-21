package ltd.tomato.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import ltd.tomato.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping(value = "/**/Course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping(value = "/getCourse")
    @ResponseBody
    public JSONObject getCourse(@RequestParam Map map) throws Exception {
        System.out.println(map.toString());
        JSONObject obj = JSONObject.parseObject(JSON.toJSONString(map));
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        return JSONObject.parseObject(JSON.toJSONString(courseService.getCourseByUser(obj), SerializerFeature.WriteMapNullValue,
                SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteDateUseDateFormat));
    }
}
