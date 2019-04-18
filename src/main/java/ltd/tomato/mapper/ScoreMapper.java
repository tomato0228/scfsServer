package ltd.tomato.mapper;

import ltd.tomato.model.Score;
import ltd.tomato.model.ScoreExample;
import org.springframework.stereotype.Repository;

/**
 * ScoreMapper继承基类
 */
@Repository
public interface ScoreMapper extends MyBatisBaseDao<Score, Integer, ScoreExample> {
}