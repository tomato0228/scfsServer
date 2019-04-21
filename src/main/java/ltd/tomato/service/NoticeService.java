package ltd.tomato.service;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public interface NoticeService {
    /**
     * 按用户ID查找通知列表
     *
     * @param object 教师：用户ID、班级ID，学生/家长：用户ID
     * @return 返回通知列表
     * @throws Exception 处理异常
     */
    Map<String, Object> getNoticeByUser(JSONObject object) throws Exception;

    /**
     * 教师增加通知
     *
     * @param object 教师：用户ID、班级ID
     * @return 返回是否增加成功
     * @throws Exception 处理异常
     */
    Map<String, Object> addNoticeByTeacher(JSONObject object) throws Exception;

    /**
     * 教师删除通知
     *
     * @param object 教师：通知ID
     * @return 返回是否增加成功
     * @throws Exception 处理异常
     */
    Map<String, Object> deleteNoticeByTeacher(JSONObject object) throws Exception;

    /**
     * 教师编辑通知
     *
     * @param object 教师：通知ID + 内容
     * @return 返回是否增加成功
     * @throws Exception 处理异常
     */
    Map<String, Object> editNoticeByTeacher(JSONObject object) throws Exception;

}
