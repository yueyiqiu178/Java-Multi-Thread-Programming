package com.multi.thread.chapter7.section1.example3;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/23 上午11:56
 */
public class MyThread1 extends Thread {

    @Override
    public void run() {
        MyService.serviceMethod();
    }
}
