package com.multi.thread.chapter8.section2.example8;

public class ThreadB2 extends Thread {
	private MyServiceB service;

	public ThreadB2(MyServiceB service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " beginB" + System.currentTimeMillis());
			service.queue.transfer("我从ThreadB2来");
			System.out.println(Thread.currentThread().getName() + " endB" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
