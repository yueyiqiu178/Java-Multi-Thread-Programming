package com.multi.thread.chapter8.section2.example5;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Userinfo implements Delayed {
	private String username;
	private long runNanoTime;

	public Userinfo(String username, long secondTime) {
		this.username = username;
		long dalayNanoTime = TimeUnit.SECONDS.toNanos(secondTime);
		runNanoTime = System.nanoTime() + dalayNanoTime;
	}

	public String getUsername() {
		return username;
	}

// compareTo()方法决定了Userinfo在队列中的顺序，如果getDelay()方法返回延时的
// 时间到了，就将队列的列头中的任务取出并执行，即getDelay()方法返回小
// 的值对应的Userinfo要放在队列的前面，放在前面要返回-1
	@Override
	public int compareTo(Delayed o) {
		Userinfo other = (Userinfo) o;
		if (this.runNanoTime > other.runNanoTime) {
			return 1;
		} else {

			return -1;
		}
	}

	@Override
	public long getDelay(TimeUnit unit) {
		return runNanoTime - System.nanoTime();
	}
}
