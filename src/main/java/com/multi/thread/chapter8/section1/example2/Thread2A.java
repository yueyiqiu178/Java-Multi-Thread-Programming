package com.multi.thread.chapter8.section1.example2;

public class Thread2A extends Thread {
	private MyService2 service;

	public Thread2A(MyService2 service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethod();
	}
}