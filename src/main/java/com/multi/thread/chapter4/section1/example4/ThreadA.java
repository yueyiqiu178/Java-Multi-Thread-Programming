package com.multi.thread.chapter4.section1.example4;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/19 下午9:50
 */
public class ThreadA extends Thread {

    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitMethod();
    }
}
