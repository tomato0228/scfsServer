package ltd.tomato.mapper;

import ltd.tomato.model.School;
import ltd.tomato.model.SchoolExample;
import org.springframework.stereotype.Repository;

/**
 * SchoolMapper继承基类
 */
@Repository
public interface SchoolMapper extends MyBatisBaseDao<School, Integer, SchoolExample> {
}