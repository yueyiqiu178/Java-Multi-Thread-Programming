package com.multi.thread.chapter8.section1.example4;

public class Test3 {
	public static void main(String[] args) {
		MyService3 service = new MyService3();
		Thread3A a = new Thread3A(service);
		Thread3B b = new Thread3B(service);

		a.start();
		b.start();
	}
}
