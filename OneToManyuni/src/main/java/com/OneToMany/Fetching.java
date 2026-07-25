package com.OneToMany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
		EntityManager em = emf.createEntityManager();
		
		Bank b1 = em.find(Bank.class, 1);
		Bank b2 = em.find(Bank.class, 2);
		
		if(b1!=null) {
			
			List<Account> a=b1.getAcc();
			System.out.println(b1.getId()+ " "+ b1.getName());
			
			for(Account a1 :a) {
				System.out.println(a1.getId()+" "+ a1.getType());
			}
			
		}
		else {
			System.out.println("id not exists!");
		}
		if(b2!=null) {
			List<Account> a=b2.getAcc();
			System.out.println(b2.getId() + " "+ b2.getName());
			
			for(Account a2 : a) {
				System.out.println(a2.getId()+" "+ a2.getType());
			}
		}
		else {
			System.out.println("id not exists");
		}
		

	}

}
