package com.assignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
		EntityManager em = emf.createEntityManager();
		
		Engine e = em.find(Engine.class, 1);
		
		if(e!=null) {
			System.out.println(e.getId() +" "+ e.getName());
			Car c = e.getC();
			System.out.println(c.getId()+" "+ c.getName());
		}
		else {
			System.out.println("Id not exists");
		}

	}

}
