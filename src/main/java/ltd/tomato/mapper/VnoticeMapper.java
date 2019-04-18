package ltd.tomato.mapper;

import ltd.tomato.model.Vnotice;
import ltd.tomato.model.VnoticeExample;
import org.springframework.stereotype.Repository;

/**
 * VnoticeMapper继承基类
 */
@Repository
public interface VnoticeMapper extends MyBatisBaseDao<Vnotice, Integer, VnoticeExample> {
}