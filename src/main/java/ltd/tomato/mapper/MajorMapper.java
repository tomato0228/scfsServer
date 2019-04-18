package ltd.tomato.mapper;

import ltd.tomato.model.Major;
import ltd.tomato.model.MajorExample;
import org.springframework.stereotype.Repository;

/**
 * MajorMapper继承基类
 */
@Repository
public interface MajorMapper extends MyBatisBaseDao<Major, Integer, MajorExample> {
}