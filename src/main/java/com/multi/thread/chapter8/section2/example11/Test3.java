package com.multi.thread.chapter8.section2.example11;

public class Test3 {
	public static void main(String[] args) throws InterruptedException {
		MyServiceC service = new MyServiceC();

		for (int i = 0; i < 10; i++) {
			ThreadC a = new ThreadC(service);
			a.setName("a");
			a.start();
		}
		Thread.sleep(1000);
		System.out.println("有没有线程正在等待数据 " + service.queue.hasWaitingConsumer());
		System.out.println("有" + service.queue.getWaitingConsumerCount() + "个线程正在等待数据");
	}
}
