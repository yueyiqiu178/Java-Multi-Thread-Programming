package com.multi.thread.chapter8.section1.example5;

public class Thread5B extends Thread {
	private MyService5 service;

	public Thread5B(MyService5 service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethod();
	}
}
