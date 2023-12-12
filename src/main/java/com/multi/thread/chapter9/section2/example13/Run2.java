package com.multi.thread.chapter9.section2.example13;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run2 {
	public static void main(String[] args) throws InterruptedException {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(4, 8, 5, TimeUnit.SECONDS,
				new LinkedBlockingDeque<Runnable>());
		System.out.println("线程池中的线程数A?：" + executor.getPoolSize());
		System.out.println("Z1=" + executor.prestartAllCoreThreads());
		System.out.println("线程池中的线程数A?：" + executor.getPoolSize());
		System.out.println();
		System.out.println("Z2=" + executor.prestartAllCoreThreads());
		System.out.println("线程池中的线程数A?：" + executor.getPoolSize());
	}
}
