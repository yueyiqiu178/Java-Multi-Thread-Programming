package com.multi.thread.chapter9.section2.example18;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		ArrayBlockingQueue queue = new ArrayBlockingQueue(2);
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, queue,
				new ThreadPoolExecutor.DiscardOldestPolicy());
		for (int i = 0; i < 5; i++) {
			MyRunnable runnable = new MyRunnable("Runnable" + (i + 1));
			executor.execute(runnable);
		}
		Thread.sleep(50);
		Iterator iterator = queue.iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			System.out.println(((MyRunnable) object).getUsername() + "@");
		}
		executor.execute(new MyRunnable("Runnable6"));
		executor.execute(new MyRunnable("Runnable7"));
		iterator = queue.iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			System.out.println(((MyRunnable) object).getUsername());
		}
	}
}
