package com.multi.thread.chapter8.section1.example3;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		MyService4 myService = new MyService4();
		Thread4A a = new Thread4A(myService);
		Thread4B b = new Thread4B(myService);
		a.start();
		b.start();
	}
}
