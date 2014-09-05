package com.prac.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.prac.core.model.BaseEntity;
import com.prac.service.GenericDao;

/**
 *
 * @author hungpx
 *
 * @param <T>
 */
@Transactional
public class GenericDaoImpl implements GenericDao {
	@PersistenceContext(unitName = "prac-webapp")
	private EntityManager entityManager;

	public GenericDaoImpl() {
	}

	@Override
	public <T extends BaseEntity> T findById(Class<T> type, long id) {
		return entityManager.find(type, id);
	}

	@Override
	public <T extends BaseEntity> List<T> findAll(Class<T> type) {
		return entityManager.createQuery("SELECT e from " + type.getName(), type).getResultList();
	}

	@Override
	public <T extends BaseEntity> T insert(T entity) {
		entityManager.persist(entity);
		return entity;
	}

	@Override
	public void remove(Object entity) {
		entityManager.remove(entity);
	}

	@Override
	public <T extends BaseEntity> T update(T entity) {
		return entityManager.merge(entity);
	}

	protected EntityManager getEntityManager() {
		return entityManager;
	}
}
