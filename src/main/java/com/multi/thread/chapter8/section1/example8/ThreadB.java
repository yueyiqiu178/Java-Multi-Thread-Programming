package com.multi.thread.chapter8.section1.example8;

public class ThreadB extends Thread {
	private MyService1 service;

	public ThreadB(MyService1 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			service.queue.add("threadB" + (i + 1));
		}
	}
}
