package com.jobportal.main;
import java.util.List;
import java.util.Scanner;

import com.job_portal.entity.User;
import com.jobportal.dao.UserDAO;

public class FindByEmailContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Type mail");
        String email = sc.next();
		UserDAO dao = new UserDAO();
		
		List<User> list = dao.findByEmailContains(email);
		
		for(User u : list) {
			System.out.println(u);
		}

	}

}
