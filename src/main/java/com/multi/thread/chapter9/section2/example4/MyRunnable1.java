package com.multi.thread.chapter9.section2.example4;

public class MyRunnable1 implements Runnable {
	public void run() {
		System.out.println("begin " + Thread.currentThread().getName() + "" + System.currentTimeMillis());
		for (int i = 0; i < Integer.MAX_VALUE / 50; i++) {
			String newString = new String();

			Math.random();
			Math.random();
			Math.random();
			Math.random();
			Math.random();
			Math.random();
		}
		System.out.println(" end " + Thread.currentThread().getName() + "" + System.currentTimeMillis());
	}
}
