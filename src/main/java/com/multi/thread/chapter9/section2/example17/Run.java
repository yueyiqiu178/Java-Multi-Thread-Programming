package com.multi.thread.chapter9.section2.example17;

public class Run {
	public static void main(String[] args) {
		MyThreadA a = new MyThreadA();
		a.setName("AAAAAAAAA");
		a.start();
		System.out.println("main线程不再阻塞，可以执行更多的任务了!");
	}
}
