package com.multi.thread.chapter8.section2.example2;

public class Test1_1 {
	public static void main(String[] args) throws InterruptedException {
		//MyService service = new MyService(false);
		MyService service = new MyService(true);
		TakeThread[] array1 = new TakeThread[10];
		TakeThread[] array2 = new TakeThread[10];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = new TakeThread(service);
			array1[i].setName("+++");
		}
		for (int i = 0; i < array1.length; i++) {
			array1[i].start();
		}
		for (int i = 0; i < array2.length; i++) {
			array2[i] = new TakeThread(service);
			array2[i].setName("---");
		}
		Thread.sleep(300);
		service.queue.put("abc");
		service.queue.put("abc");
		service.queue.put("abc");
		service.queue.put("abc");
		service.queue.put("abc");
		service.queue.put("abc");
		service.queue.put("abc");
		service.queue.put("abc");
		service.queue.put("abc");
		service.queue.put("abc");
		for (int i = 0; i < array2.length; i++) {
			array2[i].start();
		}
	}
}
