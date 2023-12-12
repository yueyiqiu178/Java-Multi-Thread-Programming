package com.multi.thread.chapter9.section2.example2;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run3_3 {
	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					System.out.println(Thread.currentThread().getName() + " run!" + System.currentTimeMillis());
					Thread.sleep(15000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		};
		ThreadPoolExecutor executor = new ThreadPoolExecutor(7, 8, 5, TimeUnit.SECONDS,
				new SynchronousQueue<Runnable>());
		executor.execute(runnable); // 1
		executor.execute(runnable); // 2
		executor.execute(runnable); // 3
		executor.execute(runnable); // 4
		executor.execute(runnable); // 5
		executor.execute(runnable); // 6
		executor.execute(runnable); // 7
		executor.execute(runnable); // 8
		Thread.sleep(1000);
		System.out.println("A executor.getCorePoolSize()=" + executor.getCorePoolSize());
		System.out.println("A executor.getMaximumPoolSize()=" + executor.getMaximumPoolSize());
		System.out.println("A executor.getPoolSize()=" + executor.getPoolSize());
		System.out.println("A executor.getQueue().size()=" + executor.getQueue().size());
		Thread.sleep(10000);
		System.out.println("10秒后打印结果");
		System.out.println("B executor.getCorePoolSize()=" + executor.getCorePoolSize());
		System.out.println("B executor.getMaximumPoolSize()=" + executor.getMaximumPoolSize());
		System.out.println("B executor.getPoolSize()=" + executor.getPoolSize());
		System.out.println("B executor.getQueue().size()=" + executor.getQueue().size());
		Thread.sleep(10000);
		System.out.println("20秒后打印结果");
		System.out.println("C executor.getCorePoolSize()=" + executor.getCorePoolSize());

		System.out.println("C executor.getMaximumPoolSize()=" + executor.getMaximumPoolSize());
		System.out.println("C executor.getPoolSize()=" + executor.getPoolSize());
		System.out.println("C executor.getQueue().size()=" + executor.getQueue().size());
	}
}
