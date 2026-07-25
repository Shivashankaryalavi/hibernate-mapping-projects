package com.pentagonManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
		EntityManager em = emf.createEntityManager();
	    EntityTransaction et = em.getTransaction();
	    
	    Reviews r1 =new Reviews();
	    r1.setId(101);
	    r1.setMessage("GOOD");
	    
	    Reviews r2 = new Reviews();
	    r2.setId(102);
	    r2.setMessage("Nice");
	    
	    Product p = new Product();
	    p.setId(1);
	    p.setName("Phone");
	    
	    r1.setP(p);
	    r2.setP(p);
	    
	    et.begin();
	    em.persist(r1);
	    em.persist(r2);
	    em.persist(p);
	    et.commit();

	}

}
