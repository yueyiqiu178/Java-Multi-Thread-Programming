package com.multi.thread.chapter9.section2.example11;

public class MyRunnable1 implements Runnable {
	private String username;

	public MyRunnable1(String username) {
		super();
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis());
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
