package com.multi.thread.chapter9.section2.example1;

import java.util.concurrent.LinkedBlockingQueue;

public class Test1 {
	public static void main(String[] args) {
		LinkedBlockingQueue q = new LinkedBlockingQueue<>();
		q.add("我是线程1");
		q.add("我是线程2");
		q.add("我是线程3");
		System.out.println(q.poll() + " " + q.size());
		System.out.println(q.poll() + " " + q.size());
		System.out.println(q.poll() + " " + q.size());
	}
}
