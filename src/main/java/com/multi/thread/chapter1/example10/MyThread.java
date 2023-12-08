package com.multi.thread.chapter1.example10;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/05 上午11:04
 */
public class MyThread extends Thread {

    private int i = 5;

    @Override
    public void run() {
        System.out.println("i = " + (i--) + " threadName = " + Thread.currentThread().getName());
    }
}
