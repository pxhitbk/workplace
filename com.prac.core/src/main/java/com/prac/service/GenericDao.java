package com.prac.service;

import java.util.List;

import com.prac.core.model.BaseEntity;

/**
 *
 * <p>
 * Interface provides all generic method for select or manipulate base entities
 * <p>
 *
 * @author hungpx
 *
 * @version 0.1
 *
 */
public interface GenericDao {

	<T extends BaseEntity> T findById(Class<T> type, long id);

	<T extends BaseEntity> List<T> findAll(Class<T> type);

	<T extends BaseEntity> T insert(T entity);

	<T extends BaseEntity> void remove(T entity);

	<T extends BaseEntity> T update(T entity, Class<T> classType);
}
