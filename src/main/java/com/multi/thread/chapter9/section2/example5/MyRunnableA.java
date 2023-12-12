package com.multi.thread.chapter9.section2.example5;

public class MyRunnableA implements Runnable {
	private String username;

	public MyRunnableA(String username) {
		super();
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	@Override
	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE / 500; i++) {
			String newString1 = new String();
			String newString5 = new String();
			String newString6 = new String();
			String newString7 = new String();
			Math.random();
			Math.random();
			Math.random();
		}
		System.out.println(Thread.currentThread().getName() + " 任务完成!");
	}
}
