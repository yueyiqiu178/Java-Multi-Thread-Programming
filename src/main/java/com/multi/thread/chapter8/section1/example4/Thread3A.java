package com.multi.thread.chapter8.section1.example4;

public class Thread3A extends Thread {
	private MyService3 service;

	public Thread3A(MyService3 service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethod();
	}
}