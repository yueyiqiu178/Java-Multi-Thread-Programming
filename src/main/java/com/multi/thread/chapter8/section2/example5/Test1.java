package com.multi.thread.chapter8.section2.example5;

import java.util.concurrent.DelayQueue;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		Userinfo userinfo5 = new Userinfo("中国5", 5);
		Userinfo userinfo4 = new Userinfo("中国4", 4);
		Userinfo userinfo3 = new Userinfo("中国3", 3);
		Userinfo userinfo2 = new Userinfo("中国2", 2);
		Userinfo userinfo1 = new Userinfo("中国1", 1);
		DelayQueue<Userinfo> queue = new DelayQueue<>();
		queue.add(userinfo5);
		queue.add(userinfo4);
		queue.add(userinfo3);
		queue.add(userinfo2);
		queue.add(userinfo1);
		System.out.println(queue.take().getUsername() + " " + System.currentTimeMillis());
		System.out.println(queue.take().getUsername() + " " + System.currentTimeMillis());
		System.out.println(queue.take().getUsername() + " " + System.currentTimeMillis());
		System.out.println(queue.take().getUsername() + " " + System.currentTimeMillis());

		System.out.println(queue.take().getUsername() + " " + System.currentTimeMillis());
	}
}
