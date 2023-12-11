package com.multi.thread.chapter8.section1.example8;

public class Test2_1 {
	public static void main(String[] args) {
		MyService1 service = new MyService1();
		System.out.println(service.queue.poll());
	}
}
