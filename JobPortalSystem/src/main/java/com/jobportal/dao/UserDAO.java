package com.jobportal.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

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
	
	public List<User> findAll(){
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("SELECT u FROM User u");
	
		
		List<User> list = q.getResultList();
		em.close();
		return list;
	}
	public User findByEmail(String email) {
		
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("SELECT u FROM User u WHERE u.email=:email");
		
		q.setParameter("email", email);
		
		try {
			User u = (User) q.getSingleResult();
		
			return u;	
		}
		catch(NoResultException e) {
			return null;
		}
		finally {
			if(em.isOpen()) {
				em.close();
			}
		}
	
	}
	public  List<User> findByRole(String role) {
		EntityManager em = emf.createEntityManager();
		try {
			Query q = em.createQuery("SELECT u FROM User u WHERE u.role =  :role");
			q.setParameter("role", role);
			List<User> list = (List<User>) q.getResultList();
			return list;
		}
		finally {
			if(em.isOpen()) {
				em.close();
			}
		}
	}
	public User login(String email,String password) {
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("SELECT u FROM User u where u.email= :email AND u.password=:password");
		q.setParameter("email", email);
		q.setParameter("password", password);
		try {
			User u = (User) q.getSingleResult();
			return u;
			
		}
		catch(NoResultException e) {
			return null;
		}
		finally {
			if(em.isOpen()) {
				em.close();
			}
		}
		
	}
	public List<User> findAllOrderByEmail(){
		EntityManager em = emf.createEntityManager();
		try {
			Query q = em.createQuery("SELECT u FROM User u ORDER BY u.email");
			List<User> list =(List<User>) q.getResultList();
			return list;
		}
		finally {
			if(em.isOpen()) {
				em.close();
			}
		}
			
	}
	public List<User> findByEmailStartsWith(String email){
		EntityManager em = emf.createEntityManager();
		
		try {
			Query q = em.createQuery("SELECT u FROM User u WHERE u.email LIKE :email");
			q.setParameter("email", email+"%");
			List<User> list = (List<User>) q.getResultList();
			return list;
		}
		finally {
			if(em.isOpen()) {
				em.close();
			}
		}	
	}
	public List<User> findByEmailContains(String email){
		EntityManager em = emf.createEntityManager();
		
		try {
			Query q = em.createQuery("SELECT u FROM User u WHERE u.email LIKE :email");
			q.setParameter("email", "%" +email+"%");
			List<User> list = (List<User>) q.getResultList();
			return list;
		}
		finally {
			if(em.isOpen()) {
				em.close();
			}
		}
	}
	public int countUsers() {
		EntityManager em = emf.createEntityManager();
		
		try {
			Query q = em.createQuery("SELECT COUNT(u) FROM User u");
			int count = (int)q.getSingleResult();
			return count;
		}
		finally {
			if(em.isOpen()) {
				em.close();
			}
		}
		
	}
	public int maxUser() {
		EntityManager em = emf.createEntityManager();
		try {
			Query q = em.createQuery("SELECT MAX(u.id) FROM User u");
			int max=(int)q.getSingleResult();
			return max;
		}
		finally{
			if(em.isOpen()) {
				em.close();
			}	
		}
	}
	public int minUser() {
		EntityManager em = emf.createEntityManager();
		try {
			Query q = em.createQuery("SELECT MIN(u.id) FROM User u");
			int min =(int) q.getSingleResult();
			return min;
		}
		finally {
			if(em.isOpen()) {
				em.close();
			}
		}
	}
	public double averageUser() {
		EntityManager em = emf.createEntityManager();
		try {
			Query q = em.createQuery("SELECT AVG(u.id) FROM User u");
			double avg= (double) q.getSingleResult();
			return avg;
		}
		finally {
			if(em.isOpen()) {
				em.close();
			}
		}
	}
}

