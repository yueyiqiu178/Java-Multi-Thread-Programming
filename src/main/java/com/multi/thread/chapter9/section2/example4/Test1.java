package com.multi.thread.chapter9.section2.example4;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 myRunnable = new MyRunnable1();
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 9999L, TimeUnit.SECONDS,
				new LinkedBlockingDeque<Runnable>());
		pool.execute(myRunnable);
		pool.execute(myRunnable);
		pool.execute(myRunnable);
		pool.execute(myRunnable);
		Thread.sleep(1000);
		pool.shutdownNow();
		System.out.println("main end!");
	}
}
