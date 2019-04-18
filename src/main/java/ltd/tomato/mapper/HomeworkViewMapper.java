package ltd.tomato.mapper;

import ltd.tomato.model.HomeworkView;
import ltd.tomato.model.HomeworkViewExample;
import org.springframework.stereotype.Repository;

/**
 * HomeworkViewMapper继承基类
 */
@Repository
public interface HomeworkViewMapper extends MyBatisBaseDao<HomeworkView, HomeworkView, HomeworkViewExample> {
}