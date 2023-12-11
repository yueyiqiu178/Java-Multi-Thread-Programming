package com.multi.thread.chapter8.section2.example8;

public class Test2 {
	public static void main(String[] args) {
		try {
			MyServiceB service = new MyServiceB();
			ThreadB1 a = new ThreadB1(service);
			a.setName("a");
			ThreadB2 b = new ThreadB2(service);
			b.setName("b");
			a.start();
			Thread.sleep(4000);
			b.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
