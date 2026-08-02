package com.jobportal.main;
import java.util.List;
import java.util.Scanner;

import com.job_portal.entity.User;
import com.jobportal.dao.UserDAO;
public class FindUserByRole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a role");
		String role = sc.next();
		
		UserDAO  dao = new UserDAO();
		
		List<User> u = dao.findByRole(role);
		System.out.println(u);

	}

}
