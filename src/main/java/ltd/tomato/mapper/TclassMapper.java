package ltd.tomato.mapper;

import ltd.tomato.model.Tclass;
import ltd.tomato.model.TclassExample;
import org.springframework.stereotype.Repository;

/**
 * TclassMapper继承基类
 */
@Repository
public interface TclassMapper extends MyBatisBaseDao<Tclass, Integer, TclassExample> {
}