package com.multi.thread.chapter2.section1.example9;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午8:48
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod();
    }
}
