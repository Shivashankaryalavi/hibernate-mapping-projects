package com.jobportal.main;
import java.util.Scanner;

import com.job_portal.entity.User;
import com.jobportal.dao.UserDAO;

public class LoginUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email");
		String email=sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		
		UserDAO dao = new UserDAO();
		User u = dao.login(email, password);
		if(u!=null) {
			System.out.println("Login Successfully");
		}
		else {
			System.out.println("Invalid email or password");
		}

	}

}
