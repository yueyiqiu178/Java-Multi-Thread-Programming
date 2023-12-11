package com.multi.thread.chapter8.section2.example2;

import java.util.concurrent.ArrayBlockingQueue;

public class MyService {
	public ArrayBlockingQueue queue;

	public MyService(boolean fair) {
		queue = new ArrayBlockingQueue(10, fair);
	}

	public void take() {
		try {
			System.out.println(Thread.currentThread().getName() + "take");
			String takeString = "" + queue.take();
			System.out.println(Thread.currentThread().getName() + "take value=" + takeString);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
