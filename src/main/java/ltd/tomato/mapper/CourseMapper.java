package ltd.tomato.mapper;

import ltd.tomato.model.Course;
import ltd.tomato.model.CourseExample;
import org.springframework.stereotype.Repository;

/**
 * CourseMapper继承基类
 */
@Repository
public interface CourseMapper extends MyBatisBaseDao<Course, Integer, CourseExample> {
}