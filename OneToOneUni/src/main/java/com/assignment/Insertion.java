package com.assignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("hibernate");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Car c = new Car();
		c.setId(101);
		c.setName("Swift");
		
		Engine e = new Engine();
		e.setId(1);
		e.setName("K2");
		
		e.setC(c);
		
		et.begin();
		em.persist(c);
		em.persist(e);
		
		et.commit();
		
		

	}

}
