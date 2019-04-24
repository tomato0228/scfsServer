package ltd.tomato.service;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public interface ChatService {
    /**
     * 按发送者和接收者用户ID查找消息列表
     *
     * @param object 发送者用户ID、接收者用户ID, chatMesg == 0表示获取未读消息
     * @return 返回消息列表
     * @throws Exception 处理异常
     */
    Map<String, Object> getChatList(JSONObject object) throws Exception;

    /**
     * 按ChatID查找消息
     *
     * @param object ChatID
     * @return 返回消息
     * @throws Exception 处理异常
     */
    Map<String, Object> getChat(JSONObject object) throws Exception;

    /**
     * 按用户ID查找聊天联系人列表
     *
     * @param object 用户ID
     * @return 返回列表
     * @throws Exception 处理异常
     */
    Map<String, Object> getChatContactsByUser(JSONObject object) throws Exception;

    /**
     * 按用户ID查找联系人列表
     *
     * @param object 用户ID
     * @return 返回列表
     * @throws Exception 处理异常
     */
    Map<String, Object> getContactsByUser(JSONObject object) throws Exception;

    /**
     * 按发送者和接收者用户ID增加一条消息
     *
     * @param object 发送者用户ID、接收者用户ID、消息
     * @return 返回状态
     * @throws Exception 处理异常
     */
    Map<String, Object> addChat(JSONObject object) throws Exception;

    /**
     * 按发送者和接收者用户ID删除聊天记录
     *
     * @param object 发送者用户ID、接收者用户ID
     * @return 返回状态
     * @throws Exception 处理异常
     */
    Map<String, Object> deleteChatList(JSONObject object) throws Exception;

    /**
     * 按消息ID删除一条消息
     *
     * @param object 消息ID
     * @return 返回状态
     * @throws Exception 处理异常
     */
    Map<String, Object> deleteChat(JSONObject object) throws Exception;

    /**
     * 按发送者和接收者ID将消息变为已读
     *
     * @param object 发送者用户ID、接收者用户ID
     * @return 返回状态
     * @throws Exception 处理异常
     */
    Map<String, Object> updateChatByUser(JSONObject object) throws Exception;
}
