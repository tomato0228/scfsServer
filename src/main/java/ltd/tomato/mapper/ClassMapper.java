package ltd.tomato.mapper;

import ltd.tomato.model.Class;
import ltd.tomato.model.ClassExample;
import org.springframework.stereotype.Repository;

/**
 * ClassMapper继承基类
 */
@Repository
public interface ClassMapper extends MyBatisBaseDao<Class, Integer, ClassExample> {
}