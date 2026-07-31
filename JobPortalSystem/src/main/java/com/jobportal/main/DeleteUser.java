package com.jobportal.main;
import java.util.Scanner;

import com.jobportal.dao.UserDAO;

public class DeleteUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user id to delete");
		int id = sc.nextInt();
		
		UserDAO  dao = new UserDAO();
		
		dao.delete(id);
		System.out.println("Delete operation is completed ");
		
		sc.close();
   
	}

}
