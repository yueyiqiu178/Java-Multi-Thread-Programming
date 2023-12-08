package com.multi.thread.chapter2.section3.example4;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/13 下午2:43
 */
public class MyThread extends Thread {

    public static volatile int count;

    private static synchronized void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count = " + count);
    }

    @Override
    public void run() {
        addCount();
    }
}
