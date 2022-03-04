package com.tia.bmm.server.address;

import java.util.Scanner;

public class Address {
	String city;
    String pinCode;
    String state;
    String streetNo;
    String landmark;

    public Address() {}
    Address(String c,String p,String st,String sn,String lm) {
        city = c;
        pinCode = p;
        state = st;
        streetNo = sn;
        landmark = lm;
    }

    public Address addAddress() {
        String c;String p;String st;String sn;String lm;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter city: ");
        c = sc.nextLine();
        System.out.print("Enter Pincode: ");
        p = sc.nextLine();
        System.out.print("Enter State: ");
        st = sc.nextLine();
        System.out.print("Enter Street Name: ");
        sn = sc.nextLine();
        System.out.print("Enter Landmark: ");
        lm = sc.nextLine();

        Address a = new Address(c,p,st,sn,lm);
        return a;
    }
    public void displayAddress(Address a) {
        System.out.println("Address: " + a.streetNo + " , Near " + a.landmark + " , " + a.city);
        System.out.println("Pincode: " + a.pinCode);
        System.out.println("State: " + a.state);
    }
}
