package com.multi.thread.chapter9.section2.example2;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run5_1 {
	// 队列使用SynchronousQueue类，线程数量大于等于corePoolSize
	// 并且线程数量小于等于maximumPoolSize
	// 此时keepAliveTime值为非0的作用是在指定的时间后删除空闲线程
	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					System.out.println(Thread.currentThread().getName() + " run!" + System.currentTimeMillis());
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		ThreadPoolExecutor executor = new ThreadPoolExecutor(7, 10, 5L, TimeUnit.SECONDS,
				new SynchronousQueue<Runnable>());
		executor.execute(runnable); // 1
		executor.execute(runnable); // 2
		executor.execute(runnable); // 3
		executor.execute(runnable); // 4
		executor.execute(runnable); // 5
		executor.execute(runnable); // 6
		executor.execute(runnable); // 7
		executor.execute(runnable); // 8
		executor.execute(runnable); // 9
		Thread.sleep(300);
		System.out.println("A executor.getCorePoolSize()=" + executor.getCorePoolSize());
		System.out.println("A executor.getMaximumPoolSize()=" + executor.getMaximumPoolSize());
		System.out.println("A executor.getPoolSize()=" + executor.getPoolSize());
		System.out.println("A executor.getQueue().size()=" + executor.getQueue().size());
		Thread.sleep(2000);
		System.out.println("2秒后打印结果");
		System.out.println("B executor.getCorePoolSize()=" + executor.getCorePoolSize());
		System.out.println("B executor.getMaximumPoolSize()=" + executor.getMaximumPoolSize());
		System.out.println("B executor.getPoolSize()=" + executor.getPoolSize());
		System.out.println("B executor.getQueue().size()=" + executor.getQueue().size());
		Thread.sleep(6000);
		System.out.println("6秒后打印结果");
		System.out.println("C executor.getCorePoolSize()=" + executor.getCorePoolSize());
		System.out.println("C executor.getMaximumPoolSize()=" + executor.getMaximumPoolSize());
		System.out.println("C executor.getPoolSize()=" + executor.getPoolSize());
		System.out.println("C executor.getQueue().size()=" + executor.getQueue().size());
	}
}
