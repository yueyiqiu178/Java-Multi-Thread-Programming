package com.multi.thread.chapter8.section2.example9;

public class Test2 {
	public static void main(String[] args) {
		try {
			MyServiceB service = new MyServiceB();
			ThreadB1 a = new ThreadB1(service);
			a.setName("a");
			a.start();
			Thread.sleep(4000);
			System.out.println("队列大小为：" + service.queue.size());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
