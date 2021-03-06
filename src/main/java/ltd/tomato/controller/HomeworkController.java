package ltd.tomato.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import ltd.tomato.service.HomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping(value = "/**/Homework")
public class HomeworkController {
    @Autowired
    private HomeworkService homeworkService;

    @PostMapping(value = "/getHomework")
    @ResponseBody
    public JSONObject getHomework(@RequestParam Map map) throws Exception {
        JSONObject obj = JSONObject.parseObject(JSON.toJSONString(map));
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        return JSONObject.parseObject(JSON.toJSONString(homeworkService.getHomeworkByUser(obj), SerializerFeature.WriteMapNullValue,
                SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteDateUseDateFormat));
    }

    @PostMapping(value = "/addHomework")
    @ResponseBody
    public JSONObject addHomework(@RequestParam Map map) throws Exception {
        JSONObject obj = JSONObject.parseObject(JSON.toJSONString(map));
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        return JSONObject.parseObject(JSON.toJSONString(homeworkService.addHomeworkByTeacher(obj), SerializerFeature.WriteMapNullValue,
                SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteDateUseDateFormat));
    }

    @PostMapping(value = "/deleteHomework")
    @ResponseBody
    public JSONObject deleteHomework(@RequestParam Map map) throws Exception {
        JSONObject obj = JSONObject.parseObject(JSON.toJSONString(map));
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        return JSONObject.parseObject(JSON.toJSONString(homeworkService.deleteHomeworkByTeacher(obj), SerializerFeature.WriteMapNullValue,
                SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteDateUseDateFormat));
    }

    @PostMapping(value = "/editHomework")
    @ResponseBody
    public JSONObject editHomework(@RequestParam Map map) throws Exception {
        JSONObject obj = JSONObject.parseObject(JSON.toJSONString(map));
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        return JSONObject.parseObject(JSON.toJSONString(homeworkService.editHomeworkByTeacher(obj), SerializerFeature.WriteMapNullValue,
                SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteDateUseDateFormat));
    }
}
