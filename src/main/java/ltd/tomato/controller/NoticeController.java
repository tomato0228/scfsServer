package ltd.tomato.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import ltd.tomato.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping(value = "/**/Notice")
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @PostMapping(value = "/getNotice")
    @ResponseBody
    public JSONObject getNotice(@RequestParam Map map) throws Exception {
        System.out.println(map.toString());
        JSONObject obj = JSONObject.parseObject(JSON.toJSONString(map));
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        return JSONObject.parseObject(JSON.toJSONString(noticeService.getNoticeByUser(obj), SerializerFeature.WriteMapNullValue,
                SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteDateUseDateFormat));
    }

    @PostMapping(value = "/addNotice")
    @ResponseBody
    public JSONObject addNotice(@RequestParam Map map) throws Exception {
        System.out.println(map.toString());
        JSONObject obj = JSONObject.parseObject(JSON.toJSONString(map));
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        return JSONObject.parseObject(JSON.toJSONString(noticeService.addNoticeByTeacher(obj), SerializerFeature.WriteMapNullValue,
                SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteDateUseDateFormat));
    }

    @PostMapping(value = "/deleteNotice")
    @ResponseBody
    public JSONObject deleteNotice(@RequestParam Map map) throws Exception {
        System.out.println(map.toString());
        JSONObject obj = JSONObject.parseObject(JSON.toJSONString(map));
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        return JSONObject.parseObject(JSON.toJSONString(noticeService.deleteNoticeByTeacher(obj), SerializerFeature.WriteMapNullValue,
                SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteDateUseDateFormat));
    }

    @PostMapping(value = "/editNotice")
    @ResponseBody
    public JSONObject editNotice(@RequestParam Map map) throws Exception {
        System.out.println(map.toString());
        JSONObject obj = JSONObject.parseObject(JSON.toJSONString(map));
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        return JSONObject.parseObject(JSON.toJSONString(noticeService.editNoticeByTeacher(obj), SerializerFeature.WriteMapNullValue,
                SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteDateUseDateFormat));
    }
}
