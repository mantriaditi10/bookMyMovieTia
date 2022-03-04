/**
 * 
 */
package com.tia.bmm.server;

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
		Admin ad = new Admin();
        boolean flag;
        flag = ad.loginAsAdmin();
        if(flag) {
        	System.out.println("Successully Logged in as Admin!");
        }
        else {
        	System.out.println("Login Failed");
        }
	}

}
