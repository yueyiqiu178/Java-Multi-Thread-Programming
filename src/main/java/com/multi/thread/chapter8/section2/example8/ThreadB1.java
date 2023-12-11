package com.multi.thread.chapter8.section2.example8;

public class ThreadB1 extends Thread {
	private MyServiceB service;

	public ThreadB1(MyServiceB service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " beginA" + System.currentTimeMillis());
			System.out.println("取得的值：" + service.queue.take());
			System.out.println(Thread.currentThread().getName() + " endA" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
