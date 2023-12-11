package com.multi.thread.chapter8.section1.example7;

public class MyThread extends Thread {

	private MyService service;

	public MyThread(MyService service) {
		super();
		this.service = service;
	}

	public void run() {
		Userinfo userinfo = (Userinfo) service.set.pollFirst();
		System.out.println(userinfo.getId() + " " + userinfo.getUsername());
	}
}
