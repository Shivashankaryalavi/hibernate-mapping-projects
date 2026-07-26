package com.hibernate.mapping.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

	
	private static EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate");
	
	public static EntityManagerFactory getEntityManagerFactory() {
		return emf;
	}
}
