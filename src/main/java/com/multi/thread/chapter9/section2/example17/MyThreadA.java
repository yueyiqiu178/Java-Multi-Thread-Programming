package com.multi.thread.chapter9.section2.example17;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadA extends Thread {
	@Override
	public void run() {
		MyRunnable task = new MyRunnable();
		LinkedBlockingQueue queue = new LinkedBlockingQueue(2);
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, queue,
				new ThreadPoolExecutor.CallerRunsPolicy());
		pool.execute(task);
		pool.execute(task);
		pool.execute(task);
		pool.execute(task);
		pool.execute(task);
		pool.execute(task); // MyThreadA run
	}
}
