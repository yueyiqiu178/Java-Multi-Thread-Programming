package com.multi.thread.chapter8.section1.example5;

public class Test5 {
	public static void main(String[] args) throws InterruptedException {
		MyService5 myService = new MyService5();
		Thread5A a = new Thread5A(myService);
		Thread5B b = new Thread5B(myService);
		a.start();
		b.start();
// 成功但不支持排序
// LinkedHashMap虽然能支持顺序性，但又不支持并发
	}
}
