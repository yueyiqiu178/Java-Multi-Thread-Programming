package com.multi.thread.chapter8.section1.example5;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class MyService5 {
	public ConcurrentHashMap map = new ConcurrentHashMap();;

	public MyService5() {
		for (int i = 0; i < 100000; i++) {
			map.put(Thread.currentThread().getName() + i + 1, "abc");
		}
	}

	public void testMethod() {
		Iterator iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			iterator.remove();
			System.out.println(map.size() + " " + Thread.currentThread().getName());
		}
	}
}
