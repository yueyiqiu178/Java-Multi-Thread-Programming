package com.multi.thread.chapter8.section1.example4;

import java.util.concurrent.ConcurrentHashMap;

public class MyService3 {
	public ConcurrentHashMap map = new ConcurrentHashMap();;

	public void testMethod() {
		for (int i = 0; i < 50000; i++) {
			map.put(Thread.currentThread().getName() + " " + (i + 1),
					Thread.currentThread().getName() + " " + (i + 1));
			System.out.println(Thread.currentThread().getName() + " " + (i + 1));
		}
	}
}
