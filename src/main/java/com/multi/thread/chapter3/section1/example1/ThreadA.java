package com.multi.thread.chapter3.section1.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/14 上午9:12
 */
public class ThreadA extends Thread {

	private MyList list;

	public ThreadA(MyList list) {
		this.list = list;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				list.add();
				System.out.println("添加了" + (i + 1) + "个元素");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
