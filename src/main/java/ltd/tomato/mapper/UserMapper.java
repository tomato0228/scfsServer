package ltd.tomato.mapper;

import ltd.tomato.model.User;
import ltd.tomato.model.UserExample;
import org.springframework.stereotype.Repository;

/**
 * UserMapper继承基类
 */
@Repository
public interface UserMapper extends MyBatisBaseDao<User, Integer, UserExample> {
}