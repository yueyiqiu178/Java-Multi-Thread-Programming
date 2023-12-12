package com.multi.thread.chapter9.section2.example11;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 myRunnable1 = new MyRunnable1("测试1");
		MyRunnable1 myRunnable2 = new MyRunnable1("测试2");
		MyRunnable1 myRunnable3 = new MyRunnable1("测试3");
		MyRunnable1 myRunnable4 = new MyRunnable1("测试4");
		ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 9999L, TimeUnit.SECONDS,
				new SynchronousQueue<Runnable>());
		pool.execute(myRunnable1);
		pool.execute(myRunnable2);
		pool.execute(myRunnable3);
		pool.execute(myRunnable4);
	}
}
