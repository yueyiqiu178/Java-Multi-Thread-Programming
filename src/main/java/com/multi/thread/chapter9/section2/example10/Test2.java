package com.multi.thread.chapter9.section2.example10;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 myRunnable = new MyRunnable1();
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 99999, 9999L, TimeUnit.SECONDS,
				new LinkedBlockingDeque<Runnable>());
		pool.setThreadFactory(new MyThreadFactoryA());
		pool.execute(myRunnable);
	}
}
