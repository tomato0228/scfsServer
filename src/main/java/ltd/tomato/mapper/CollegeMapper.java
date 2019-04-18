package ltd.tomato.mapper;

import ltd.tomato.model.College;
import ltd.tomato.model.CollegeExample;
import org.springframework.stereotype.Repository;

/**
 * CollegeMapper继承基类
 */
@Repository
public interface CollegeMapper extends MyBatisBaseDao<College, Integer, CollegeExample> {
}