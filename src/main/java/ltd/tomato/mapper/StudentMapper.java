package ltd.tomato.mapper;

import ltd.tomato.model.Student;
import ltd.tomato.model.StudentExample;
import org.springframework.stereotype.Repository;

/**
 * StudentMapper继承基类
 */
@Repository
public interface StudentMapper extends MyBatisBaseDao<Student, Integer, StudentExample> {
}