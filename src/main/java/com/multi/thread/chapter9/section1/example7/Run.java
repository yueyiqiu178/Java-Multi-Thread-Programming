package com.multi.thread.chapter9.section1.example7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 3; i++) {
			executorService.execute(new MyRunnable(("" + (i + 1))));
		}
	}
}
