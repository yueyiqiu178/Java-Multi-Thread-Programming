package com.multi.thread.chapter8.section1.example8;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Test3_2 {
	public static void main(String[] args) {
		ConcurrentLinkedQueue queue = new ConcurrentLinkedQueue();
		queue.add("a");
		queue.add("b");
		queue.add("c");
		System.out.println("begin size=" + queue.size());
		System.out.println(queue.element());
		System.out.println(" end size=" + queue.size());
	}
}
