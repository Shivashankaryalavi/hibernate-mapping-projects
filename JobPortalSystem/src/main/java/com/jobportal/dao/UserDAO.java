package com.jobportal.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import com.job_portal.entity.User;
import com.jobportal.util.JPAUtil;
public class UserDAO {

	private EntityManagerFactory emf;
	private EntityManager em;
	private EntityTransaction et;
	
	public UserDAO() {
		emf=JPAUtil.getEntityManagerFactory();
		em=emf.createEntityManager();
		et = em.getTransaction();
	}
	public void insert(User u) {
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
		
	}
}
