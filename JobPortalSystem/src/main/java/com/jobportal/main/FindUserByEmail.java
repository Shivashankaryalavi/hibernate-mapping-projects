package com.jobportal.main;
import java.util.Scanner;

import com.job_portal.entity.User;
import com.jobportal.dao.UserDAO;
public class FindUserByEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email");
		String email=sc.next();
		
		UserDAO dao = new UserDAO();
		User u =dao.findByEmail(email);
		
		if(u!=null) {
			System.out.println(u);
		}
		else {
			System.out.println("Email not found!");
		}
		

	}

}
