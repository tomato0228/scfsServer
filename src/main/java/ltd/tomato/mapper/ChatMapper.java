package ltd.tomato.mapper;

import ltd.tomato.model.Chat;
import ltd.tomato.model.ChatExample;
import org.springframework.stereotype.Repository;

/**
 * ChatMapper继承基类
 */
@Repository
public interface ChatMapper extends MyBatisBaseDao<Chat, Integer, ChatExample> {
}