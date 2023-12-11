package com.multi.thread.chapter8.section1.example9;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		ThreadA aFirst = new ThreadA(service);
		ThreadA bFirst = new ThreadA(service);
		ThreadB aLast = new ThreadB(service);
		ThreadB bLast = new ThreadB(service);
		aFirst.start();
		Thread.sleep(1000);
		aLast.start();
		Thread.sleep(1000);
		bFirst.start();
		Thread.sleep(1000);
		bLast.start();
	}
}
