package com.pentagon;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchingOneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
		EntityManager em = emf.createEntityManager();
		
		Car c = em.find(Car.class, 101);
		
		if(c!=null) {
			System.out.println(c.getId()+"  "+ c.getName());
			Engine e =c.getE();
			System.out.println(e.getId()+ "  "+e.getName());
		}
		else {
			System.out.println("Id not eists");
		}
		

	}

}
