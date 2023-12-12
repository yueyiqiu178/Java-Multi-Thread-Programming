package com.multi.thread.chapter9.section2.example2;

public class MyRunnable implements Runnable {
	private String username;

	public MyRunnable(String username) {
		super();
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public void run() {
		try {
			System.out.println(username + " begin " + System.currentTimeMillis());
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
