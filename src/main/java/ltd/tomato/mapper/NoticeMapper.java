package ltd.tomato.mapper;

import ltd.tomato.model.Notice;
import ltd.tomato.model.NoticeExample;
import org.springframework.stereotype.Repository;

/**
 * NoticeMapper继承基类
 */
@Repository
public interface NoticeMapper extends MyBatisBaseDao<Notice, Integer, NoticeExample> {
}