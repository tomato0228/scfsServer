package ltd.tomato.mapper;

import ltd.tomato.model.Teacher;
import ltd.tomato.model.TeacherExample;
import org.springframework.stereotype.Repository;

/**
 * TeacherMapper继承基类
 */
@Repository
public interface TeacherMapper extends MyBatisBaseDao<Teacher, Integer, TeacherExample> {
}