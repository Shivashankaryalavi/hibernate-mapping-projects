package com.jobportal.main;
import java.util.Scanner;

import com.job_portal.entity.User;
import com.jobportal.dao.UserDAO;

public class FindUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user id!");
		int id = sc.nextInt();
		
		UserDAO dao = new UserDAO();
		
		User u = dao.find(id);
		
		
		
		if(u!=null) {
			System.out.println(u);
		}
		else {
			System.out.println("User not found");
		}
		sc.close();
		
		

	}

}
