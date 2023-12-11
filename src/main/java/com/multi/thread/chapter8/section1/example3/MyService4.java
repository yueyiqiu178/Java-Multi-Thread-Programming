package com.multi.thread.chapter8.section1.example3;

import java.util.Hashtable;
import java.util.Iterator;

public class MyService4 {
	public Hashtable table = new Hashtable();

	public MyService4() {
		for (int i = 0; i < 100000; i++) {
			table.put(Thread.currentThread().getName() + i + 1, "abc");
		}
	}

	public void testMethod() {
		Iterator iterator = table.keySet().iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			iterator.remove();
			System.out.println(table.size() + " " + Thread.currentThread().getName());
		}
	}
}
