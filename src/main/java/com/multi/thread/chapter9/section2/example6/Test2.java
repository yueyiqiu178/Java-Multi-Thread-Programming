package com.multi.thread.chapter9.section2.example6;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test2 {
	public static void main(String[] args) {
		try {
			MyRunnableA a1 = new MyRunnableA("A1");
			ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 10, 30, TimeUnit.SECONDS,
					new LinkedBlockingDeque<Runnable>());
			pool.execute(a1);
			Thread.sleep(2000);
			pool.shutdownNow();
			System.out.println("main end!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
