package com.tia.bmm.server;

public class InvalidAdminDetails extends Exception{
	String str1;

    InvalidAdminDetails(String str2) {
        str1 = str2;
    }

    public String toString() {
        return ("Error: " + str1);
    }
}
