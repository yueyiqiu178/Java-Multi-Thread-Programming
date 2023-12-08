package com.multi.thread.chapter7.section1.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/23 上午11:44
 */
public class MyThread extends Thread {

    public MyThread() {
        System.out.println("构造方法中的状态：" + Thread.currentThread().getState());
    }

    @Override
    public void run() {
        System.out.println("run方法中的状态：" + Thread.currentThread().getState());
    }
}
