package com.multi.thread.chapter9.section2.example6;

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
		try {
			while (true) {
				if (Thread.currentThread().isInterrupted() == true) {
					throw new InterruptedException();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("---任务名称：" + username + "被中断!");
		}
	}
}
