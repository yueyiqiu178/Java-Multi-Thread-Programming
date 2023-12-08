package com.multi.thread.chapter4.section1.example2;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/18 下午8:20
 */
public class ThreadB extends Thread {

    private MyService service;

    public ThreadB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
