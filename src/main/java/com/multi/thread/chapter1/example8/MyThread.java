package com.multi.thread.chapter1.example8;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/05 上午9:36
 */
public class MyThread extends Thread {

    private int count = 5;

    @Override
    public synchronized void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由" + this.currentThread().getName() + "计算，count=" + count);
        }
    }
}
