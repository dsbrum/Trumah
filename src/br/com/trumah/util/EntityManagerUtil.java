package br.com.trumah.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
	private static final EntityManagerUtil instance = new EntityManagerUtil();
	private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("trumah");

	private EntityManagerUtil() {
	}

	public static EntityManagerUtil getInstance() {
		return instance;
	}

	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public EntityManager createEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
}
