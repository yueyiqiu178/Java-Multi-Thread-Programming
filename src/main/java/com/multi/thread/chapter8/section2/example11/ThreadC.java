package com.multi.thread.chapter8.section2.example11;

public class ThreadC extends Thread {
	private MyServiceC service;

	public ThreadC(MyServiceC service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " 取得的值：" + service.queue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
