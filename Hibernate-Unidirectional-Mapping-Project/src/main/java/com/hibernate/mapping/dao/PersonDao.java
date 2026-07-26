package com.hibernate.mapping.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.hibernate.mapping.util.HibernateUtil;

import com.hibernate.mapping.entity.Person;

public class PersonDao {
	
	private EntityManagerFactory emf = HibernateUtil.getEntityManagerFactory();
	
	public void savePerson(Person p) 
	{
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(p);
		et.commit();
		
		em.close();
	}
	public Person fetchPerson(int id) {
		EntityManager em = emf.createEntityManager();
		
		Person p=em.find(Person.class, id);
		
		em.close();
		
		return p;
	}


}
