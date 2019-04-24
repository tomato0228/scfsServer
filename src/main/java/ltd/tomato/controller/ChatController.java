package ltd.tomato.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import ltd.tomato.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping(value = "/**/Chat")
public class ChatController {
    @Autowired
    private ChatService chatService;

    @PostMapping(value = "/getChatList")
    @ResponseBody
    public JSONObject getChatList(@RequestParam Map map) throws Exception {
        JSONObject obj = JSONObject.parseObject(JSON.toJSONString(map));
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        return JSONObject.parseObject(JSON.toJSONString(chatService.getChatList(obj), SerializerFeature.WriteMapNullValue,
                SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteDateUseDateFormat));
    }

    @PostMapping(value = "/getChat")
    @ResponseBody
    public JSONObject getChat(@RequestParam Map map) throws Exception {
        JSONObject obj = JSONObject.parseObject(JSON.toJSONString(map));
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        return JSONObject.parseObject(JSON.toJSONString(chatService.getChat(obj), SerializerFeature.WriteMapNullValue,
                SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteDateUseDateFormat));
    }

    @PostMapping(value = "/getChatContacts")
    @ResponseBody
    public JSONObject getChatContacts(@RequestParam Map map) throws Exception {
        JSONObject obj = JSONObject.parseObject(JSON.toJSONString(map));
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        return JSONObject.parseObject(JSON.toJSONString(chatService.getChatContactsByUser(obj), SerializerFeature.WriteMapNullValue,
                SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteDateUseDateFormat));
    }

    @PostMapping(value = "/getContacts")
    @ResponseBody
    public JSONObject getContacts(@RequestParam Map map) throws Exception {
        JSONObject obj = JSONObject.parseObject(JSON.toJSONString(map));
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        return JSONObject.parseObject(JSON.toJSONString(chatService.getContactsByUser(obj), SerializerFeature.WriteMapNullValue,
                SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteDateUseDateFormat));
    }

    @PostMapping(value = "/addChat")
    @ResponseBody
    public JSONObject addChat(@RequestParam Map map) throws Exception {
        JSONObject obj = JSONObject.parseObject(JSON.toJSONString(map));
        System.out.println(obj.toJSONString());
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        return JSONObject.parseObject(JSON.toJSONString(chatService.addChat(obj), SerializerFeature.WriteMapNullValue,
                SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteDateUseDateFormat));
    }

    @PostMapping(value = "/deleteChatList")
    @ResponseBody
    public JSONObject deleteChatList(@RequestParam Map map) throws Exception {
        JSONObject obj = JSONObject.parseObject(JSON.toJSONString(map));
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        return JSONObject.parseObject(JSON.toJSONString(chatService.deleteChatList(obj), SerializerFeature.WriteMapNullValue,
                SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteDateUseDateFormat));
    }

    @PostMapping(value = "/deleteChat")
    @ResponseBody
    public JSONObject deleteChat(@RequestParam Map map) throws Exception {
        JSONObject obj = JSONObject.parseObject(JSON.toJSONString(map));
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        return JSONObject.parseObject(JSON.toJSONString(chatService.deleteChat(obj), SerializerFeature.WriteMapNullValue,
                SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteDateUseDateFormat));
    }

    @PostMapping(value = "/updateChatByUser")
    @ResponseBody
    public JSONObject updateChatByUser(@RequestParam Map map) throws Exception {
        JSONObject obj = JSONObject.parseObject(JSON.toJSONString(map));
        JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        return JSONObject.parseObject(JSON.toJSONString(chatService.updateChatByUser(obj), SerializerFeature.WriteMapNullValue,
                SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteDateUseDateFormat));
    }
}
