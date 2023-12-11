package com.multi.thread.chapter8.section1.example1;

import java.util.HashMap;

public class MyService1 {

	public HashMap map = new HashMap();

	public void testMethod() {
		for (int i = 0; i < 50000; i++) {
			map.put(Thread.currentThread().getName() + " " + (i + 1), Thread.currentThread().getName() + " " + (i + 1));
			System.out.println(Thread.currentThread().getName() + " " + (i + 1));
		}
	}
}
