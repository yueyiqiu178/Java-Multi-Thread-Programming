package com.multi.thread.chapter9.section2.example1;

import java.util.concurrent.ArrayBlockingQueue;

public class Test3 {
	public static void main(String[] args) {
		ArrayBlockingQueue q = new ArrayBlockingQueue(3);
		q.add("我是线程1");
		q.add("我是线程2");
		q.add("我是线程3");
		// ArrayBlockingQueue容量不能扩容
		q.add("我是线程4"); // 出现异常
	}
}
