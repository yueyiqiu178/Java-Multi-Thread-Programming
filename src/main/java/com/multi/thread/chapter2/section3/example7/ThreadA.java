package com.multi.thread.chapter2.section3.example7;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/13 下午3:56
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.runMethod();
    }
}
