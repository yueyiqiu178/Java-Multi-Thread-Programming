package com.multi.thread.chapter9.section2.example9;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 myRunnable = new MyRunnable1();
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 9999L, TimeUnit.SECONDS,
				new LinkedBlockingDeque<Runnable>());
		pool.execute(myRunnable);
		pool.shutdown();
		System.out.println("main begin ! " + System.currentTimeMillis());
		System.out.println(pool.awaitTermination(10, TimeUnit.SECONDS));
		System.out.println("main end ! " + System.currentTimeMillis());
		// 代码awaitTermination(10, TimeUnit.SECONDS)的作用是
		// 最多等待10秒，也就是阻塞10秒
	}
}
