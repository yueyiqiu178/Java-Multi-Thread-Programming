package com.multi.thread.chapter8.section1.example9;

public class ThreadB extends Thread {
	private MyService service;

	public ThreadB(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		System.out.println("value=" + service.queue.pollLast() + "queue.size()=" + service.queue.size());
	}
}
