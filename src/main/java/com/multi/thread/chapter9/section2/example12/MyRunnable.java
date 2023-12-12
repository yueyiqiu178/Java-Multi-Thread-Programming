package com.multi.thread.chapter9.section2.example12;

public class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
		System.out.println(Thread.currentThread().getName() + " end " + System.currentTimeMillis());
	}
}
