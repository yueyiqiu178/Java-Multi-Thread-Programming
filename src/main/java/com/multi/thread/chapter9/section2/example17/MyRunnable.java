package com.multi.thread.chapter9.section2.example17;

public class MyRunnable implements Runnable {
	@Override
	public void run() {
		try {
			System.out.println("begin " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
