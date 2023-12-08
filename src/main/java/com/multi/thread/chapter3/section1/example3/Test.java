package com.multi.thread.chapter3.section1.example3;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/14 下午1:54
 */
public class Test {

    public static void main(String[] args) throws Exception {
        try {
            Object lock = new Object();
            MyThread1 thread1 = new MyThread1(lock);
            thread1.start();
            Thread.sleep(3000);
            MyThread2 thread2 = new MyThread2(lock);
            thread2.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
