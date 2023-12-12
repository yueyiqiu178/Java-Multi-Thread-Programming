package com.multi.thread.chapter9.section2.example13;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run1 {
	public static void main(String[] args) throws InterruptedException {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(4, 8, 5, TimeUnit.SECONDS,
				new LinkedBlockingDeque<Runnable>());
		System.out.println("线程池中的线程数A?：" + executor.getPoolSize());
		System.out.println("Z1=" + executor.prestartCoreThread());
		System.out.println("线程池中的线程数A?：" + executor.getPoolSize());
		System.out.println("Z2=" + executor.prestartCoreThread());
		System.out.println("线程池中的线程数A?：" + executor.getPoolSize());
		System.out.println("Z3=" + executor.prestartCoreThread());
		System.out.println("线程池中的线程数A?：" + executor.getPoolSize());
		System.out.println("Z4=" + executor.prestartCoreThread());
// 下面代码是无效的!
		System.out.println("线程池中的线程数A?：" + executor.getPoolSize());
		System.out.println("Z5=" + executor.prestartCoreThread());
// System.out.println("线程池中的线程数A?：" +executor.getPoolSize());
		System.out.println("Z6=" + executor.prestartCoreThread());
	}
}
