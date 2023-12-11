package com.multi.thread.chapter8.section2.example6;

public class ThreadA extends Thread {

	private MyServiceA service;

	public ThreadA(MyServiceA service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " begin" + System.currentTimeMillis());
			System.out.println("取得的值：" + service.queue.take());
			System.out.println(Thread.currentThread().getName() + " end" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}