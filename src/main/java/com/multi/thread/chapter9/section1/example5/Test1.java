package com.multi.thread.chapter9.section1.example5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService es = Executors.newCachedThreadPool();
		for (int i = 0; i < 200000; i++) {
			es.execute(new Runnable() {
				@Override
				public void run() {
					try {
						System.out.println("runnable1 begin " + Thread.currentThread().getName() + " "
								+ System.currentTimeMillis());
						Thread.sleep(1000 * 60 * 5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});

		}
	}
}
