package ltd.tomato.mapper;

import ltd.tomato.model.NoticeView;
import ltd.tomato.model.NoticeViewExample;
import org.springframework.stereotype.Repository;

/**
 * NoticeViewMapper继承基类
 */
@Repository
public interface NoticeViewMapper extends MyBatisBaseDao<NoticeView, NoticeView, NoticeViewExample> {
}