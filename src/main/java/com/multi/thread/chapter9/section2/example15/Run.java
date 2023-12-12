package com.multi.thread.chapter9.section2.example15;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run {
	public static void main(String[] args) {
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
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, new ArrayBlockingQueue(2),
				new ThreadPoolExecutor.AbortPolicy());
		executor.execute(runnable); // 不报错
		executor.execute(runnable); // 不报错
		executor.execute(runnable); // 不报错
		executor.execute(runnable); // 不报错
		executor.execute(runnable); // 不报错
// executor.execute(runnable); 报错
	}
}
