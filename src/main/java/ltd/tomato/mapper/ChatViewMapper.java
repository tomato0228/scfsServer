package ltd.tomato.mapper;

import ltd.tomato.model.ChatView;
import ltd.tomato.model.ChatViewExample;
import org.springframework.stereotype.Repository;

/**
 * ChatViewMapper继承基类
 */
@Repository
public interface ChatViewMapper extends MyBatisBaseDao<ChatView, ChatView, ChatViewExample> {
}