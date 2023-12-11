package com.multi.thread.chapter8.section2.example4;

public class ThreadTake extends Thread {
	private MyService service;

	public ThreadTake(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			service.takeMethod();
		}
	}
}
