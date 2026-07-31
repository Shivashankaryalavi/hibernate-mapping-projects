package com.jobportal.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import com.job_portal.entity.User;
import com.jobportal.util.JPAUtil;
public class UserDAO {

	private EntityManagerFactory emf;	
	public UserDAO() {
		emf=JPAUtil.getEntityManagerFactory();
	
	}
	public void insert(User u) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
			em.persist(u);
			et.commit();
		}
		catch(Exception e) {
			if(et.isActive()) {
				et.rollback();
			}
			e.printStackTrace();	
		}
		finally {
			if(em.isOpen()) {
				em.close();
			}
		}
		
	}
	public User find(int id) {
		EntityManager em = emf.createEntityManager();
		
		User u = em.find(User.class, id);
		
		em.close();
		
		return u;
	}
	
	public void update(User u) {
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		try {
			et.begin();
			
			em.merge(u);
			
			et.commit();
		}
		catch(Exception e) {
			if(et.isActive()) {
				et.rollback();
			}
			e.printStackTrace();
		}
		finally {
			if(em.isOpen()) {
				em.close();
			}
		}
	}
	public void delete(int id) {

	    EntityManager em = emf.createEntityManager();
	    EntityTransaction et = em.getTransaction();

	    try {

	        User u = em.find(User.class, id);

	        if (u != null) {

	            et.begin();

	            em.remove(u);

	            et.commit();

	        } else {

	            System.out.println("User not found");

	        }

	    } catch (Exception e) {

	        if (et.isActive()) {
	            et.rollback();
	        }

	        e.printStackTrace();

	    } finally {

	        if (em.isOpen()) {
	            em.close();
	        }

	    }
	}
		
	}
}
