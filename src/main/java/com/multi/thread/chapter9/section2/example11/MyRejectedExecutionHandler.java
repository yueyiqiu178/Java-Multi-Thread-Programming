package com.multi.thread.chapter9.section2.example11;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class MyRejectedExecutionHandler implements RejectedExecutionHandler {
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		System.out.println(((MyRunnable1) r).getUsername() + " 被拒绝执行");
	}
}