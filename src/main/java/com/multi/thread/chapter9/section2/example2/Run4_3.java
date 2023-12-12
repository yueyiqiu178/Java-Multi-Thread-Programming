package com.multi.thread.chapter9.section2.example2;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run4_3 {
	// 队列使用SynchronousQueue类
	// 线程数量大于corePoolSize
	// 并且线程数量大于maximumPoolSize
	// 所以出现异常
	public static void main(String[] args) throws InterruptedException {
	Runnable runnable = new Runnable() {
	@Override
	public void run() {
	try {
	System.out.println(Thread.currentThread().getName() +
	" run!"
	+ System.currentTimeMillis());
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	e.printStackTrace();
	}
	}
	};
	ThreadPoolExecutor executor = new ThreadPoolExecutor(7, 8, 5,TimeUnit.SECONDS,new SynchronousQueue<Runnable>());
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
	System.out.println("A executor.getCorePoolSize()=" +
	executor.getCorePoolSize());
	System.out.println("A executor.getMaximumPoolSize()=" +executor.getMaximumPoolSize());
	System.out.println("A executor.getPoolSize()=" +executor.getPoolSize());
	System.out.println("A executor.getQueue().size()=" +executor.getQueue().size());
	Thread.sleep(10000);
	System.out.println("10秒后打印结果");
	System.out.println("B executor.getCorePoolSize()=" +executor.getCorePoolSize());
	System.out.println("B executor.getMaximumPoolSize()=" +executor.getMaximumPoolSize());
	System.out.println("B executor.getPoolSize()=" +executor.getPoolSize());
	System.out.println("B executor.getQueue().size()=" +executor.getQueue().size());
	}
	// 按钮会变灰
	}
