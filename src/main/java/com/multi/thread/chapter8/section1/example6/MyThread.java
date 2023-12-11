package com.multi.thread.chapter8.section1.example6;

public class MyThread extends Thread {
	private MyService service;

	public MyThread(MyService service) {
		super();
		this.service = service;
	}

	public void run() {
		service.testMethod();
	}
}
