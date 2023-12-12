package com.multi.thread.chapter9.section2.example22;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class GetLargestPoolSize_test1 {
	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 5, 6, TimeUnit.SECONDS,
				new LinkedBlockingQueue<Runnable>(6));
		for (int i = 0; i < 10; i++) {
			executor.execute(runnable);
		}
		Thread.sleep(30000);
		System.out.println(executor.getPoolSize());
		System.out.println(executor.getLargestPoolSize());
	}
}
