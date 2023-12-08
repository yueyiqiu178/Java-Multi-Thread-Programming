package com.multi.thread.chapter2.section2.example2;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/10 下午5:07
 */
public class ThreadA extends Thread {

    private ObjectService service;

    public ThreadA(ObjectService service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }
}
