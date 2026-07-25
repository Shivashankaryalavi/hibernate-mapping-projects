package com.OneToMany;

import java.util.ArrayList;
import java.util.List;

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
		
		Account a1 = new Account();
		a1.setId(101);
		a1.setType("Saving");
		
		Account a2 = new Account();
		a2.setId(102);
		a2.setType("Personal");
		
		Account a3 = new Account();
		a3.setId(103);
		a3.setType("Loan");
		
		
	   Bank b1 = new Bank();
	   b1.setId(1);
	   b1.setName("SBI");
	   
	   Bank b2 = new Bank();
	   b2.setId(2);
	   b2.setName("Canara");
	   
	   
	   List<Account> l = new ArrayList<>();
	   l.add(a1);
	   l.add(a2);
	   
	   List<Account> l1 = new ArrayList<>();
	   l1.add(a3);
	   
	   b1.setAcc(l);
	   b2.setAcc(l1);
	   
	   et.begin();
	   
	    em.persist(a1);
	    em.persist(a2);
	    em.persist(a3);
	    
	    em.persist(b1);
	    em.persist(b2);
	   et.commit();

	}

}
