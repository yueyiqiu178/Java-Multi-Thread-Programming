package com.multi.thread.chapter8.section1.example2;

import java.util.Hashtable;

public class MyService2 {
	public Hashtable table = new Hashtable();

	public void testMethod() {
		for (int i = 0; i < 50000; i++) {
			table.put(Thread.currentThread().getName() + " " + (i + 1),
					Thread.currentThread().getName() + " " + (i + 1));
			System.out.println(Thread.currentThread().getName() + " " + (i + 1));
		}
	}
}
