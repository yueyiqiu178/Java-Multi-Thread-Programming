package com.multi.thread.chapter4.section1.example23;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/21 下午7:55
 */
public class MyThreadB extends Thread {

    private Service service;

    public MyThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.notifyMethod();
    }
}
