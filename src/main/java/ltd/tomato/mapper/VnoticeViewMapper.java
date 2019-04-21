package ltd.tomato.mapper;

import ltd.tomato.model.VnoticeView;
import ltd.tomato.model.VnoticeViewExample;
import org.springframework.stereotype.Repository;

/**
 * VnoticeViewMapper继承基类
 */
@Repository
public interface VnoticeViewMapper extends MyBatisBaseDao<VnoticeView, VnoticeView, VnoticeViewExample> {
}