package com.multi.thread.chapter3.section2.example5;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/17 下午12:01
 */
public class ThreadB extends Thread {

    @Override
    public synchronized void run() {
        try {
            System.out.println("begin B threadName = " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end B threadName =   " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
