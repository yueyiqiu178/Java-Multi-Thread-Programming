package com.multi.thread.chapter1.example12;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/05 下午4:09
 */
public class MyThread extends Thread {

    public MyThread() {
        System.out.println("构造方法的打印：" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法的打印：" + Thread.currentThread().getName());
    }
}
