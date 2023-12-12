package com.multi.thread.chapter9.section2.example19;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = new Runnable() {
			public void run() {
				try {
					Thread.sleep(5000);
					System.out.println(Thread.currentThread().getName() + " run end!");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		ArrayBlockingQueue queue = new ArrayBlockingQueue(2);
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, queue,
				new ThreadPoolExecutor.DiscardPolicy());
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		Thread.sleep(8000);
		System.out.println(executor.getPoolSize() + " " + queue.size());
	}
}
