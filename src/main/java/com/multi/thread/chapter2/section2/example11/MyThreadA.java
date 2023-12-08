package com.multi.thread.chapter2.section2.example11;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 下午1:36
 */
public class MyThreadA extends Thread {

    private Service service;

    private MyObject object;

    public MyThreadA(Service service, MyObject object) {
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}
