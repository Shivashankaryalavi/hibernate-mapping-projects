package com.jobportal.main;

import com.jobportal.dao.UserDAO;

public class MaxUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDAO dao = new UserDAO();
		
		int max = dao.maxUser();
		System.out.println(max);
		

	}

}
