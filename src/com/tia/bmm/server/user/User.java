package com.tia.bmm.server.user;

public class User {
	int userId;
    String name;
    String mobNo;
    String emailId;
    String sex;

    User() {}

    User(int uid, String n, String mno, String eid, String gen) {
        userId = uid;
        name = n;
        mobNo = mno;
        emailId = eid;
        sex = gen;
    }
}
