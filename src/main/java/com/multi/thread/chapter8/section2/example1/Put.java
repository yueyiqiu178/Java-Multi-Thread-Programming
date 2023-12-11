package com.multi.thread.chapter8.section2.example1;

import java.util.concurrent.ArrayBlockingQueue;

public class Put {
	public static void main(String[] args) {
		try {

			ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
			queue.put("a1");
			queue.put("a2");
			queue.put("a3");
			System.out.println(queue.size());
			System.out.println(System.currentTimeMillis());
			queue.put("a4");
			System.out.println(System.currentTimeMillis());
		} catch (InterruptedException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
