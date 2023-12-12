package com.multi.thread.chapter9.section2.example21;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test3 {
	public static void main(String[] args) {
		try {
			Runnable runnable1 = new Runnable() {
				@Override
				public void run() {
					try {
						System.out.println(
								"beginA " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
						Thread.sleep(5000);
						System.out.println(
								" endA " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
			Runnable runnable2 = new Runnable() {
				@Override
				public void run() {
					try {
						System.out.println(
								"beginB " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
						Thread.sleep(5000);
						System.out.println(
								" endB " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
			ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 5, TimeUnit.SECONDS,
					new LinkedBlockingDeque<Runnable>());
			executor.submit(runnable1);
			executor.submit(runnable2);
			Thread.sleep(1000);
			executor.remove(runnable2);
			System.out.println("main end!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
