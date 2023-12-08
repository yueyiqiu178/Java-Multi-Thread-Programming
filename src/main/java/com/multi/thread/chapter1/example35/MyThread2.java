package com.multi.thread.chapter1.example35;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午8:41
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {
        System.out.println("MyThread2 run Priority = " + this.getPriority());
    }
}
