package com.multi.thread.chapter2.section2.example12;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 下午1:46
 */
public class ThreadA extends Thread {

    private Service service;

    private MyObject object;

    public ThreadA(Service service, MyObject object) {
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}
