package com.multi.thread.chapter9.section2.example10;

import java.util.Date;
import java.util.concurrent.ThreadFactory;

public class MyThreadFactoryA implements ThreadFactory {
	public Thread newThread(Runnable r) {
		Thread newThread = new Thread(r);
		newThread.setName("高洪岩：" + new Date());
		return newThread;
	}
}
