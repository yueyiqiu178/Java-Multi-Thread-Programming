package com.multi.thread.chapter2.section2.example8;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 上午9:57
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.a();
    }
}
