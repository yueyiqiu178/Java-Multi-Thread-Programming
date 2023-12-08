package com.multi.thread.chapter4.section1.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/18 下午8:15
 */
public class MyThread extends Thread {

    private MyService service;

    public MyThread(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
