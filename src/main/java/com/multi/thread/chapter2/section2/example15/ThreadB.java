package com.multi.thread.chapter2.section2.example15;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 下午3:58
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.printB();
    }
}
