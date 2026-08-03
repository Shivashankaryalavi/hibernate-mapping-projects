package com.jobportal.main;
import com.job_portal.entity.User;
import com.jobportal.dao.UserDAO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       UserDAO dao = new UserDAO();
	   
	   User u1 = new User();
	   u1.setEmail("shivabasava@gmail.com");
	   u1.setPassword("Shiva@9339");
	   u1.setRole("Job_Seeker");
	   dao.insert(u1);
	   
	   User u2 = new User();
	   u2.setEmail("Basava@gmail.com");
	   u2.setPassword("Basa@9339");
	   u2.setRole("Job_Provider");
	   dao.insert(u2);
	   
	   User u3 = new User();
	   u3.setEmail("vinayak@gmail.com");
	   u3.setPassword("vinu@123");
	   u3.setRole("Manager");
	   dao.insert(u3);
	   
	   

	}

}
