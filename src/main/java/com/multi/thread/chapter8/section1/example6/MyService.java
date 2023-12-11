package com.multi.thread.chapter8.section1.example6;

import java.util.Map.Entry;
import java.util.concurrent.ConcurrentSkipListMap;

public class MyService {
	public ConcurrentSkipListMap<Userinfo, String> map = new ConcurrentSkipListMap<>();

	public MyService() {
		Userinfo userinfo1 = new Userinfo(1, "userinfo1");
		Userinfo userinfo3 = new Userinfo(3, "userinfo3");
		Userinfo userinfo5 = new Userinfo(5, "userinfo5");
		Userinfo userinfo2 = new Userinfo(2, "userinfo2");
		Userinfo userinfo4 = new Userinfo(4, "userinfo4");
		map.put(userinfo1, "u1");
		map.put(userinfo3, "u3");
		map.put(userinfo5, "u5");
		map.put(userinfo2, "u2");
		map.put(userinfo4, "u4");
	}

	public void testMethod() {
		Entry<Userinfo, String> entry = map.pollFirstEntry();
		System.out.println("map.size()=" + map.size());

		Userinfo userinfo = entry.getKey();
		System.out.println(
				userinfo.getId() + " " + userinfo.getUsername() + " " + map.get(userinfo) + " " + entry.getValue());
	}
}
