package com.multi.thread.chapter9.section2.example3;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 myRunnable = new MyRunnable1();
		ThreadPoolExecutor pool = new ThreadPoolExecutor(7, 10, 0L, TimeUnit.SECONDS,
				new LinkedBlockingDeque<Runnable>());
		pool.execute(myRunnable);
		System.out.println("main end!");
	}
}
