package ltd.tomato.mapper;

import ltd.tomato.model.Validation;
import ltd.tomato.model.ValidationExample;
import org.springframework.stereotype.Repository;

/**
 * ValidationMapper继承基类
 */
@Repository
public interface ValidationMapper extends MyBatisBaseDao<Validation, Integer, ValidationExample> {
}