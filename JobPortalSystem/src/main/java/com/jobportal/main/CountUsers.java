package com.jobportal.main;

import com.jobportal.dao.UserDAO;

public class CountUsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDAO dao = new UserDAO();
		
		long count = dao.countUsers();
		
		System.out.println("Total User :" + count);

	}

}
