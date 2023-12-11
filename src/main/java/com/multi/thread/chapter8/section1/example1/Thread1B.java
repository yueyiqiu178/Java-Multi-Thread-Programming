package com.multi.thread.chapter8.section1.example1;

public class Thread1B extends Thread {
	private MyService1 service;

	public Thread1B(MyService1 service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethod();
	}
}
