package com.jobportal.main;

import com.jobportal.dao.UserDAO;

public class MinUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDAO dao = new UserDAO();
		int min = dao.minUser();
		System.out.println("Minimum User Id :"+ min);
	}

}
