package com.multi.thread.chapter8.section1.example6;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		MyThread a1 = new MyThread(service);
		MyThread a2 = new MyThread(service);
		MyThread a3 = new MyThread(service);
		MyThread a4 = new MyThread(service);

		MyThread a5 = new MyThread(service);
		a1.start();
		Thread.sleep(1000);
		a2.start();
		Thread.sleep(1000);
		a3.start();
		Thread.sleep(1000);
		a4.start();
		Thread.sleep(1000);
		a5.start();
	}
}
