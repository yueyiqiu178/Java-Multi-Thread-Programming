package com.multi.thread.chapter2.section1.example9;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午8:44
 */
public class Service {

	public synchronized void testMethod() {
		if (Thread.currentThread().getName().equals("A")) {
			System.out.println("Thread name = " + Thread.currentThread().getName() + " run begintime = "
					+ System.currentTimeMillis());
			int i = 1;
			while (i == 1) {
				if (("" + Math.random()).substring(0, 8).equals("0.123456")) {
					System.out.println("ThreadName = " + Thread.currentThread().getName() + " run exceptionTime = "
							+ System.currentTimeMillis());
					Integer.parseInt("a");
				}
//				else {
//					System.out.println("ThreadName = " + Thread.currentThread().getName() + " run ok = "
//							+ System.currentTimeMillis());
//				}
			}
		} else {
			System.out.println("Thread B run Time=" + System.currentTimeMillis());
		}
	}
}
