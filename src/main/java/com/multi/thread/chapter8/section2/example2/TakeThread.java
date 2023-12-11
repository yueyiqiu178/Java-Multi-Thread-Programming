package com.multi.thread.chapter8.section2.example2;

public class TakeThread extends Thread {
	private MyService service;

	public TakeThread(MyService service) {
		super();
		this.service = service;
	}

	public void run() {
		service.take();
	}
}
