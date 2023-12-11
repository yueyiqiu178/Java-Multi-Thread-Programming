package com.multi.thread.chapter8.section1.example8;

public class Test1 {
	public static void main(String[] args) {
		try {
			MyService1 service = new MyService1();
			ThreadA a = new ThreadA(service);
			ThreadB b = new ThreadB(service);
			a.start();
			b.start();
			a.join();
			b.join();
			System.out.println(service.queue.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
