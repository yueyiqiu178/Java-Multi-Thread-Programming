package com.multi.thread.chapter9.section2.example2;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run3_1 {
	// 队列使用LinkedBlockingQueue类，也就是如果
	// 线程数量大于corePoolSize并且小于等于maximumPoolSize时
	// 将maximumPoolSize-corePoolSize的任务放入队列中
	// 同一时间最多只能有7个线程在运行
	// 如果使用LinkedBlockingQueue类则maximumPoolSize参数作用将忽略
	// 因为任务都放入LinkedBlockingQueue队列中了
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
		ThreadPoolExecutor executor = new ThreadPoolExecutor(7, 8, 5, TimeUnit.SECONDS, new LinkedBlockingQueue());
		executor.execute(runnable); // 1
		executor.execute(runnable); // 2
		executor.execute(runnable); // 3
		executor.execute(runnable); // 4
		executor.execute(runnable); // 5
		executor.execute(runnable); // 6
		executor.execute(runnable); // 7
		executor.execute(runnable); // 8
		executor.execute(runnable); // 4
		executor.execute(runnable); // 5
		executor.execute(runnable); // 6
		executor.execute(runnable); // 7
		executor.execute(runnable); // 8
		Thread.sleep(300);
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
	}

	// 按钮呈红色，因为池中还有线程在等待任务
	//LinkedBlockingQueue abc;
}
