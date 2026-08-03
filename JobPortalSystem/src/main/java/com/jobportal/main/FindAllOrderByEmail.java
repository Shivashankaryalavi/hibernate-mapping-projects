package com.jobportal.main;

import java.util.List;

import com.job_portal.entity.User;
import com.jobportal.dao.UserDAO;

public class FindAllOrderByEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDAO dao = new UserDAO();
		
		List<User> list = dao.findAllOrderByEmail();
		
		for(User u : list) {
			System.out.println(u);
		}

	}

}
