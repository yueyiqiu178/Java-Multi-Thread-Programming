package com.multi.thread.chapter9.section2.example2;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class RunX_3 {
	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					System.out.println(Thread.currentThread().getName() + " run!" + System.currentTimeMillis());
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 6, 5, TimeUnit.SECONDS, new LinkedBlockingQueue(2));
// 使用core线程
		executor.execute(runnable); // 1
		executor.execute(runnable); // 2
		executor.execute(runnable); // 3
// 使用第三方队列中的线程
		executor.execute(runnable); // 1
		executor.execute(runnable); // 2
// C-B
		executor.execute(runnable); // 1
		executor.execute(runnable); // 2
		executor.execute(runnable); // 3
		executor.execute(runnable); // 4

		Thread.sleep(300);
		System.out.println("A executor.getCorePoolSize()=" + executor.getCorePoolSize());
		System.out.println("A executor.getMaximumPoolSize()=" + executor.getMaximumPoolSize());
		System.out.println("A executor.getPoolSize()=" + executor.getPoolSize());
		System.out.println("A executor.getQueue().size()=" + executor.getQueue().size());
		Thread.sleep(800);
		System.out.println("800后打印结果");
		System.out.println("B executor.getCorePoolSize()=" + executor.getCorePoolSize());
		System.out.println("B executor.getMaximumPoolSize()=" + executor.getMaximumPoolSize());
		System.out.println("B executor.getPoolSize()=" + executor.getPoolSize());
		System.out.println("B executor.getQueue().size()=" + executor.getQueue().size());
		Thread.sleep(1000);
		System.out.println("1000后打印结果");
		System.out.println("C executor.getCorePoolSize()=" + executor.getCorePoolSize());
		System.out.println("C executor.getMaximumPoolSize()=" + executor.getMaximumPoolSize());
		System.out.println("C executor.getPoolSize()=" + executor.getPoolSize());
		System.out.println("C executor.getQueue().size()=" + executor.getQueue().size());
		Thread.sleep(10000); // 下面打印是验证销毁了C-B
		System.out.println("10000后打印结果");
		System.out.println("D executor.getCorePoolSize()=" + executor.getCorePoolSize());

		System.out.println("D executor.getMaximumPoolSize()=" + executor.getMaximumPoolSize());
		System.out.println("D executor.getPoolSize()=" + executor.getPoolSize());
		System.out.println("D executor.getQueue().size()=" + executor.getQueue().size());
	}
// 按钮呈红色，因为池中还有线程在等待任务
}
