package com.jobportal.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
	
	public static EntityManagerFactory getEntityManagerFactory() {
		return emf;
	}
    

}
