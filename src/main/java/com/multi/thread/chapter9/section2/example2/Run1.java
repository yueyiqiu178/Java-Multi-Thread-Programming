package com.multi.thread.chapter9.section2.example2;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run1 {

// 获取基本属性corePoolSize和maximumPoolSize
	public static void main(String[] args) {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(7, 8, 5, TimeUnit.SECONDS, new LinkedBlockingQueue());
		System.out.println(executor.getCorePoolSize());
		System.out.println(executor.getMaximumPoolSize());
		System.out.println("");
		executor = new ThreadPoolExecutor(7, 8, 5, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
		System.out.println(executor.getCorePoolSize());
		System.out.println(executor.getMaximumPoolSize());
	}
}
