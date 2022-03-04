/**
 * 
 */
package com.tia.bmm.server.main;

import java.util.Scanner;

import com.tia.bmm.server.admin.Admin;
import com.tia.bmm.server.user.UserList;

/**
 * @author aditi
 *
 */
public class MainMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice = 0;
      
        UserList ul = new UserList();
        
        do {
        	System.out.println("\nMenu:\n1. Register as User.\n2. Login as Admin.\n");
            System.out.println("-1 to exit");
            System.out.print("Enter Choice:");
            choice = Integer.parseInt(sc.nextLine());

            switch(choice) {
                case 1:
                    ul.createUser();
                    break;

                case 2: //Admin Login and Its functionalities.
                    Admin ad = new Admin();
                    boolean flag;
                    flag = ad.loginAsAdmin();
                    if(flag) {
                        System.out.println("\nSuccessfully Logged in as Admin!!\n");
	                    int c;
	                    do {
	                        System.out.println("\nAdmin Menu:\n1. Movie Management.\n2. Theatres Management.\n3. Display registered Users.\n-1. Logout.\n");
	                        System.out.print("Enter choice: ");
	                        c = Integer.parseInt(sc.nextLine());
	
	                        switch(c) {
	                            case 1:
	                                System.out.println("Movie Management");
	                                break;
	
	                            case 2:
	                            	System.out.println("Theatre Management");
	                                break;
	
	                            case 3:
	                                ul.displayUsers();
	                                break;
	                        }
	                    }while(c!=-1);
                    }
                    break;
              }   
        }
        while(choice!=-1);   
	}
}
