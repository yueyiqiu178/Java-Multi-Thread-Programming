package com.multi.thread.chapter9.section2.example16;

public class MyThreadA extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println(" end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
