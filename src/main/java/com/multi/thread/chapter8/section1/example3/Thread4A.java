package com.multi.thread.chapter8.section1.example3;

public class Thread4A extends Thread {
	private MyService4 service;

	public Thread4A(MyService4 service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethod();
	}
}