package ltd.tomato.mapper;

import ltd.tomato.model.Parents;
import ltd.tomato.model.ParentsExample;
import org.springframework.stereotype.Repository;

/**
 * ParentsMapper继承基类
 */
@Repository
public interface ParentsMapper extends MyBatisBaseDao<Parents, Integer, ParentsExample> {
}