package com.multi.thread.chapter8.section1.example8;

public class Test2_2 {
	public static void main(String[] args) {
		MyService1 service = new MyService1();
		service.queue.add("a");
		service.queue.add("b");
		service.queue.add("c");
		System.out.println(service.queue.size());
		System.out.println(service.queue.poll());
		System.out.println(service.queue.size());

	}
}
