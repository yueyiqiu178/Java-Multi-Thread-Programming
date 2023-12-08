package com.multi.thread.chapter1.example17;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/06 上午9:32
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("run threadName = " + this.currentThread().getName() + " begin = " + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("run threadName = " + this.currentThread().getName() + " ends = " + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
