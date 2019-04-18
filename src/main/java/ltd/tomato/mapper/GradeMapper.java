package ltd.tomato.mapper;

import ltd.tomato.model.Grade;
import ltd.tomato.model.GradeExample;
import org.springframework.stereotype.Repository;

/**
 * GradeMapper继承基类
 */
@Repository
public interface GradeMapper extends MyBatisBaseDao<Grade, Integer, GradeExample> {
}