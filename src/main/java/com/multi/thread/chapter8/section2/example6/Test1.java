package com.multi.thread.chapter8.section2.example6;

public class Test1 {
	public static void main(String[] args) {
		MyServiceA service = new MyServiceA();
		ThreadA a = new ThreadA(service);
		a.start();
	}
}