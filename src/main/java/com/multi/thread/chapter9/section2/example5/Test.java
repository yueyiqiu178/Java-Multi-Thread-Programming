package com.multi.thread.chapter9.section2.example5;

import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {
	public static void main(String[] args) {
		try {
			MyRunnableA a1 = new MyRunnableA("A1");
			MyRunnableA a2 = new MyRunnableA("A2");
			MyRunnableA a3 = new MyRunnableA("A3");
			MyRunnableA a4 = new MyRunnableA("A4");
			ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 10, 30, TimeUnit.SECONDS,
					new LinkedBlockingDeque<Runnable>());
			pool.execute(a1);
			pool.execute(a2);
			pool.execute(a3);
			pool.execute(a4);
			Thread.sleep(1000);
			List<Runnable> list = pool.shutdownNow();
			for (int i = 0; i < list.size(); i++) {
				MyRunnableA myRunnableA = (MyRunnableA) list.get(i);
				System.out.println(myRunnableA.getUsername() + " 任务被取消!");
			}
			System.out.println("main end!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
