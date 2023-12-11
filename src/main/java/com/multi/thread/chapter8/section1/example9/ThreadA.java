package com.multi.thread.chapter8.section1.example9;

public class ThreadA extends Thread {
	private MyService service;

	public ThreadA(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		System.out.println("value=" + service.queue.pollFirst() + "queue.size()=" + service.queue.size());
	}
}
