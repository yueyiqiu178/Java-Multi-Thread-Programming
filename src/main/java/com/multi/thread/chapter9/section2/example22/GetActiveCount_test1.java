package com.multi.thread.chapter9.section2.example22;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class GetActiveCount_test1 {
	public static void main(String[] args) throws InterruptedException {
		try {
			MyThreadA a = new MyThreadA();
			SynchronousQueue queue = new SynchronousQueue();
			ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 5, 5, TimeUnit.SECONDS, queue);
			pool.execute(a);
			pool.execute(a);
			pool.execute(a);
			System.out.println(pool.getActiveCount() + " " + pool.getPoolSize());
			Thread.sleep(7000);
			System.out.println(pool.getActiveCount() + " " + pool.getPoolSize());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
