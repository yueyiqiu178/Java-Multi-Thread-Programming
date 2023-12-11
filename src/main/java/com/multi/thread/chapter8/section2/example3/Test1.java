package com.multi.thread.chapter8.section2.example3;

import java.util.concurrent.PriorityBlockingQueue;

public class Test1 {
	public static void main(String[] args) {
		PriorityBlockingQueue<Userinfo> queue = new PriorityBlockingQueue<Userinfo>();
		queue.add(new Userinfo(12));
		queue.add(new Userinfo(13478));
		queue.add(new Userinfo(1569));
		queue.add(new Userinfo(1346));
		queue.add(new Userinfo(1762));
		queue.add(new Userinfo(1876876));
		System.out.println(queue.poll().getId());
		System.out.println(queue.poll().getId());
		System.out.println(queue.poll().getId());
		System.out.println(queue.poll().getId());
		System.out.println(queue.poll().getId());
		System.out.println(queue.poll().getId());

		System.out.println(queue.poll());
	}
}
