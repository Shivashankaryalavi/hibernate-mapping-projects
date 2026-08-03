package com.jobportal.main;

import com.jobportal.dao.UserDAO;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDAO dao = new UserDAO();
		
		double avg = dao.averageUser();
		System.out.println("Average User Id  :" + avg);
		

	}

}
