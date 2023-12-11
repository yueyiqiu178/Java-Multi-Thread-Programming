package com.multi.thread.chapter8.section1.example11;

public class MyThread extends Thread {
	private MyService service;

	public MyThread(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {

			service.set.add(Thread.currentThread().getName() + "anyString" + (i + 1));
		}
	}
}
