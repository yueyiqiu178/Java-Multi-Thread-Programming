package com.multi.thread.chapter9.section2.example3;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test4 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 myRunnable = new MyRunnable1();
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 9999L, TimeUnit.SECONDS,
				new LinkedBlockingDeque<Runnable>());
		pool.execute(myRunnable);
		pool.execute(myRunnable);
		pool.execute(myRunnable);
		pool.execute(myRunnable);
		Thread.sleep(1000);
		pool.shutdown();
		pool.execute(myRunnable);
		System.out.println("main end!");
	}
}
