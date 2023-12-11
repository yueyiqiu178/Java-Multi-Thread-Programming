package com.multi.thread.chapter8.section2.example10;

public class Test2 {
	public static void main(String[] args) {
		MyServiceB service = new MyServiceB();
		ThreadB1 a = new ThreadB1(service);
		a.setName("a");
		a.start();

	}
}
