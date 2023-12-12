package com.multi.thread.chapter9.section2.example2;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class RunX_END {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable r1 = new MyRunnable("R1");
		MyRunnable r2 = new MyRunnable("R2");
		MyRunnable r3 = new MyRunnable("R3");
		MyRunnable r4 = new MyRunnable("R4");
		MyRunnable r5 = new MyRunnable("R5");
		MyRunnable r6 = new MyRunnable("R6");
		MyRunnable r7 = new MyRunnable("R7");
		MyRunnable r8 = new MyRunnable("R8");
		MyRunnable r9 = new MyRunnable("R9");
		ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 6, 5, TimeUnit.SECONDS, new LinkedBlockingQueue(2));
		executor.setRejectedExecutionHandler(new RejectedExecutionHandler() {

			@Override
			public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
				System.out.println(" " + ((MyRunnable) r).getUsername() + "被拒绝执行");
			}
		});
// core核心中的任务
		executor.execute(r1); // 1
		Thread.sleep(1000);
		executor.execute(r2); // 2
		Thread.sleep(1000);
		executor.execute(r3); // 3
		Thread.sleep(1000);
// 队列中的任务
		executor.execute(r4); // 1
		Thread.sleep(1000);
		executor.execute(r5); // 2
// C-B
		executor.execute(r6); // 1
		Thread.sleep(1000);
		executor.execute(r7); // 2
		Thread.sleep(1000);
		executor.execute(r8); // 3
		Thread.sleep(1000);
		executor.execute(r9); // 4 （拒绝执行）
	}
}
