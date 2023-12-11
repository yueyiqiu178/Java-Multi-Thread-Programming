package com.multi.thread.chapter8.section1.example9;

import java.util.concurrent.ConcurrentLinkedDeque;

public class MyService {
	public ConcurrentLinkedDeque queue = new ConcurrentLinkedDeque();

	public MyService() {
		for (int i = 0; i < 4; i++) {
			queue.add("string" + (i + 1));
		}
	}
}
