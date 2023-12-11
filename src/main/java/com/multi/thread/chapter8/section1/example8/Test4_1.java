package com.multi.thread.chapter8.section1.example8;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Test4_1 {
	public static void main(String[] args) {
		ConcurrentLinkedQueue queue = new ConcurrentLinkedQueue();

		System.out.println(queue.peek());
	}
}
