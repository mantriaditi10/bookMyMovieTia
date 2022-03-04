package com.tia.bmm.server.user;

import java.util.HashMap;
import java.util.Scanner;

public class UserList {
	HashMap<Integer,User> Ul = new HashMap<Integer,User>();
    static int id;

    static {
        id = 1;
    }

    public void createUser() {
        Scanner sc = new Scanner(System.in);
        String name; String d; String mno; String eid; String gen;
        System.out.println("\nEnter your details:");

        System.out.print("Name: ");
        name = sc.nextLine();

        System.out.print("Mobile No: ");
        mno = sc.nextLine();

        System.out.print("Email id: ");
        eid = sc.nextLine();

        System.out.print("Gender: ");
        gen = sc.nextLine();

        User usr = new User(id,name,mno,eid,gen);

        Ul.put(id,usr);
        id++;
    }

    boolean loginAsUser() {
        Scanner sc = new Scanner(System.in);
        String eid;
        System.out.print("\nEnter email: ");
        eid = sc.nextLine();
        User u = new User();
        for(Integer i : Ul.keySet()) {
            u = Ul.get(i);
            if(u.emailId.equals(eid)) return true;
        }
        return false;
    }

    public void displayUsers() {
        User u = new User();
        System.out.println("\n\n-------------------------------------------------");
        System.out.println("\nUSER DATABASE:");
        for(Integer i : Ul.keySet()) {
            u = Ul.get(i);
            System.out.println("\nUserId: "+ u.userId);
            System.out.println("Name: " + u.name);
            System.out.println("Mobile No.: "+ u.mobNo);
            System.out.println("Email: " + u.emailId);
            System.out.println("Gender: " + u.sex);
            System.out.println();
        }
        System.out.println("-------------------------------------------------\n");
    }
}
