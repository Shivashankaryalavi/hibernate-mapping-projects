package com.jobportal.main;
import java.util.Scanner;

import com.job_portal.entity.User;
import com.jobportal.dao.UserDAO;

public class UpdateUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user id to update!");
		int id = sc.nextInt();
		UserDAO dao = new UserDAO();
		User u=dao.find(id);
		
		System.out.println("Enter a choice to update");
		System.out.println("1.Email Update");
		System.out.println("2.password Update");
		System.out.println("3.Role Update");
		System.out.println("4.For all fields");
		int choice =sc.nextInt();
		
		if(u!=null) {
			switch(choice) {
		    case 1:
		        System.out.print("Enter new email: ");
		        u.setEmail(sc.next());
		        break;

		    case 2:
		        System.out.print("Enter new password: ");
		        u.setPassword(sc.next());
		        break;

		    case 3:
		        System.out.print("Enter new role: ");
		        u.setRole(sc.next());
		        break;

		    case 4:
		        // Asking  for all fields
		    	System.out.print("Enter new email: ");
		    	u.setEmail(sc.next());

		    	System.out.print("Enter new password: ");
		    	u.setPassword(sc.next());

		    	System.out.print("Enter new role: ");
		    	u.setRole(sc.next());
		    	break;

		    
		    default:
		        System.out.println("Invalid choice");
		        return;
		}

		dao.update(u);
		System.out.println("User updated successfully.");
			
		}else {
			System.out.println("User ID does not exist.");
		}
		
		
		
	

	}

}
