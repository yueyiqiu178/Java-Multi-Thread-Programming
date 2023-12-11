package com.multi.thread.chapter8.section1.example3;

public class Thread4B extends Thread {
	private MyService4 service;

	public Thread4B(MyService4 service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethod();
	}
}
