package com.multi.thread.chapter4.section2.example2;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/22 下午12:16
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}
