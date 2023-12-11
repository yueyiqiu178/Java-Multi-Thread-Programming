package com.multi.thread.chapter8.section1.example2;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		MyService2 service = new MyService2();
		Thread2A a = new Thread2A(service);
		Thread2B b = new Thread2B(service);
		a.start();
		b.start();
	}
}
