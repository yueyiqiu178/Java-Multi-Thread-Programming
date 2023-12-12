package com.multi.thread.chapter9.section2.example10;

public class MyRunnable2 implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis());
		String abc = null;
		abc.indexOf(0);
		System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis());
	}
}
