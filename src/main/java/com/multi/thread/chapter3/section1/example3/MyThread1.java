package com.multi.thread.chapter3.section1.example3;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/14 下午1:51
 */
public class MyThread1 extends Thread {

    private Object lock;

    public MyThread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                System.out.println("开始 wait time = " + System.currentTimeMillis());
                lock.wait();
                System.out.println("结束 wait time = " + System.currentTimeMillis());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
