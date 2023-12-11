package com.multi.thread.chapter9.section1.example4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {
	public static void main(String[] args) {
		MyThreadFactory threadFactory = new MyThreadFactory();
		ExecutorService executorService = Executors.newCachedThreadPool(threadFactory);
		executorService.execute(new Runnable() {
			public void run() {
				System.out.println("我在运行" + System.currentTimeMillis() + " " + Thread.currentThread().getName());
			}
		});
	}
}
