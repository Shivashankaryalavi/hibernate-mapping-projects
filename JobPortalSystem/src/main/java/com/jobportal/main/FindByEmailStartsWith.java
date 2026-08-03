package com.jobportal.main;
import java.util.Scanner;

import java.util.List;

import com.job_portal.entity.User;
import com.jobportal.dao.UserDAO;

public class FindByEmailStartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email");
		String email =sc.next();
		UserDAO  dao = new UserDAO();
		
		List<User> list=dao.findByEmailStartsWith(email);
		
		for(User u:list) {
			System.out.println(u);
		}
		

	}

}
