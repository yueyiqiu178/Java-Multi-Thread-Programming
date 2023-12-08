package com.multi.thread.chapter4.section2.example3;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/22 下午12:16
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}
