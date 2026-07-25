package com.pentagonManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
		EntityManager em = emf.createEntityManager();
		
		Reviews r1 = em.find(Reviews.class, 101);
		
		if(r1!=null) {
			System.out.println(r1.getId() +" "+ r1.getMessage());
			Product p=r1.getP();
			System.out.println(p.getId()+" "+ p.getName());
		}
		else {
			System.out.println("Id not exists");
		}
		

	}

}
