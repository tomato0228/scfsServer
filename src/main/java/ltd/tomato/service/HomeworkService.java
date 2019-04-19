package ltd.tomato.service;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public interface HomeworkService {
    /**
     * 按用户ID查找作业列表
     *
     * @param object 教师：用户ID、班级ID、课程ID，学生/家长：用户ID
     * @return 返回作业列表
     * @throws Exception 处理异常
     */
    Map<String, Object> getHomeworkByUser(JSONObject object) throws Exception;

    /**
     * 教师增加作业
     *
     * @param object 教师：用户ID、班级ID、课程ID
     * @return 返回是否增加成功
     * @throws Exception 处理异常
     */
    Map<String, Object> addHomeworkByTeacher(JSONObject object) throws Exception;

    /**
     * 教师删除作业
     *
     * @param object 教师：作业ID
     * @return 返回是否增加成功
     * @throws Exception 处理异常
     */
    Map<String, Object> deleteHomeworkByTeacher(JSONObject object) throws Exception;

    /**
     * 教师编辑作业
     *
     * @param object 教师：作业ID + 内容
     * @return 返回是否增加成功
     * @throws Exception 处理异常
     */
    Map<String, Object> editHomeworkByTeacher(JSONObject object) throws Exception;

}
