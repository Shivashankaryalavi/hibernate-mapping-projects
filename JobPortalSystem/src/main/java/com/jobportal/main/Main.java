package com.jobportal.main;
import com.job_portal.entity.User;
import com.jobportal.dao.UserDAO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   User u = new User();
	   u.setId(1);
	   u.setEmail("shivabasava@gmail.com");
	   u.setPassword("Shiva@9339");
	   u.setRole("Job_Seeker");
	   
	   UserDAO dao = new UserDAO();
	   dao.insert(u);
	   
	   

	}

}
