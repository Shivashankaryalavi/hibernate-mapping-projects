package com.jobportal.main;

import java.util.List;

import com.job_portal.entity.User;
import com.jobportal.dao.UserDAO;

public class FindAllUsers {
	
	public static void main(String[] args) {
		UserDAO dao = new UserDAO();
		
		List<User> list=dao.findAll();
		
		for(User u : list) {
			System.out.println(u);
		}
	}

}
