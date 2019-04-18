package ltd.tomato.mapper;

import ltd.tomato.model.Semester;
import ltd.tomato.model.SemesterExample;
import org.springframework.stereotype.Repository;

/**
 * SemesterMapper继承基类
 */
@Repository
public interface SemesterMapper extends MyBatisBaseDao<Semester, Integer, SemesterExample> {
}