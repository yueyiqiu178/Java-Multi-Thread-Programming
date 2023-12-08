package com.multi.thread.chapter4.section1.example22;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/21 下午7:55
 */
public class MyThread extends Thread {

    private Service service;

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
