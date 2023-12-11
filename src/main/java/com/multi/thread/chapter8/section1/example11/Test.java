package com.multi.thread.chapter8.section1.example11;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		MyService service = new MyService();
		MyThread[] aArray = new MyThread[100];
		for (int i = 0; i < aArray.length; i++) {
			aArray[i] = new MyThread(service);
		}
		for (int i = 0; i < aArray.length; i++) {
			aArray[i].start();
		}
		Thread.sleep(3000);
		System.out.println(service.set.size());
	}
}
