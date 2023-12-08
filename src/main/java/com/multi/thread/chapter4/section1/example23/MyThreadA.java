package com.multi.thread.chapter4.section1.example23;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/21 下午7:55
 */
public class MyThreadA extends Thread {

    private Service service;

    public MyThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.waitMethod();
    }
}
