package com.multi.thread.chapter8.section1.example5;

public class Thread5A extends Thread {
	private MyService5 service;

	public Thread5A(MyService5 service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethod();
	}
}