package ltd.tomato.mapper;

import ltd.tomato.model.ContactView;
import ltd.tomato.model.ContactViewExample;
import org.springframework.stereotype.Repository;

/**
 * ContactViewMapper继承基类
 */
@Repository
public interface ContactViewMapper extends MyBatisBaseDao<ContactView, ContactView, ContactViewExample> {
}