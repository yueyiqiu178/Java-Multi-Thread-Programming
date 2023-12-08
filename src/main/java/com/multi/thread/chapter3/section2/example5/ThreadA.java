package com.multi.thread.chapter3.section2.example5;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/17 下午12:01
 */
public class ThreadA extends Thread {

    private ThreadB b;

    public ThreadA(ThreadB b) {
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
                System.out.println("begin A threadName = " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("end A threadName = " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
