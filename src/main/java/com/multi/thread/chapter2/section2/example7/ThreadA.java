package com.multi.thread.chapter2.section2.example7;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 上午9:27
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.setUsernamePassword("a", "aa");
    }
}
