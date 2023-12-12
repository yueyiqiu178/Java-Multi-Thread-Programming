package com.multi.thread.chapter9.section2.example2;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run4_1 {
	// 队列使用LinkedBlockingQueue类
	// 并且线程数量大于corePoolSize时将其余的任务放入队列中
	// 同一时间最多只能有7个线程在运行
	// 所以keepAliveTime大于5时也不清除空闲线程
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
		executor.execute(runnable); // 9
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
	// 通过此实验可以得知，如果使用LinkedBlockingQueue作为任务队列
	// 则不管线程数大于corePoolSize还是大于maximumPoolSize
	// 都将多余的任务放入队列中
	// 程序都可以正确无误地运行，并且不会出现异常
	// 此时按钮呈红色，因为池中还有线程在等待任务
}
