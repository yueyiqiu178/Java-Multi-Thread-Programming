package com.multi.thread.chapter8.section1.example1;

public class Thread1A extends Thread {
	private MyService1 service;

	public Thread1A(MyService1 service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethod();
	}
}