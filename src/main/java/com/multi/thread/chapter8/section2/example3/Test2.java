package com.multi.thread.chapter8.section2.example3;

import java.util.concurrent.PriorityBlockingQueue;

public class Test2 {
	public static void main(String[] args) {
		try {
			PriorityBlockingQueue<Userinfo> queue = new PriorityBlockingQueue<Userinfo>();
			System.out.println("begin");
			System.out.println(queue.take());
			System.out.println(" end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
