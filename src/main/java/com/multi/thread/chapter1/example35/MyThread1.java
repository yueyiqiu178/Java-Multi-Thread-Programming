package com.multi.thread.chapter1.example35;

import com.multi.thread.chapter1.example34.MyThread;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午8:40
 */
public class MyThread1 extends Thread {

    @Override
    public void run() {
        System.out.println("MyThread1 run Priority = " + this.getPriority());
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
    }
}
