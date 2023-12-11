package com.multi.thread.chapter9.section2.example1;

import java.util.concurrent.LinkedBlockingQueue;

public class Test1_1 {
	public static void main(String[] args) {
		LinkedBlockingQueue q = new LinkedBlockingQueue(2);
		q.add("我是线程1");
		q.add("我是线程2");
		q.add("我是线程3");
	}
}
