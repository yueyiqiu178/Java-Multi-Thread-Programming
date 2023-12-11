package com.multi.thread.chapter8.section1.example7;

import java.util.concurrent.ConcurrentSkipListSet;

public class MyService {
	public ConcurrentSkipListSet set = new ConcurrentSkipListSet();

	public MyService() {
		Userinfo userinfo1 = new Userinfo(1, "username1");
		Userinfo userinfo3 = new Userinfo(3, "username3");
		Userinfo userinfo5 = new Userinfo(5, "username5");
		Userinfo userinfo41 = new Userinfo(4, "username4");
		Userinfo userinfo42 = new Userinfo(4, "username4");
		Userinfo userinfo2 = new Userinfo(2, "username2");
		set.add(userinfo1);
		set.add(userinfo3);
		set.add(userinfo5);
		set.add(userinfo41);
		set.add(userinfo42);
		set.add(userinfo2);
	}
}
