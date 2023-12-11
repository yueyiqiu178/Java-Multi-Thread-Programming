package com.multi.thread.chapter9.section2.example1;

import java.util.concurrent.SynchronousQueue;

public class Test2 {
	private static SynchronousQueue q = new SynchronousQueue();

	public static void main(String[] args) throws InterruptedException {
		Thread put = new Thread() {
			public void run() {
				try {
					for (int i = 0; i < 5; i++) {
						String putString = "我是线程" + Math.random();
						q.put(putString);
						System.out.println(" putString=" + putString);
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			};
		};
		put.start();
		Thread get = new Thread() {
			public void run() {
				try {
					for (int i = 0; i < 5; i++) {
						String takeString = "" + q.take();
						System.out.println("takeString=" + takeString);
						Thread.sleep(1000);
					}

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			};
		};
		get.start();
	}
}
