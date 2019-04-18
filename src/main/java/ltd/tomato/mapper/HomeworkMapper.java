package ltd.tomato.mapper;

import ltd.tomato.model.Homework;
import ltd.tomato.model.HomeworkExample;
import org.springframework.stereotype.Repository;

/**
 * HomeworkMapper继承基类
 */
@Repository
public interface HomeworkMapper extends MyBatisBaseDao<Homework, Integer, HomeworkExample> {
}