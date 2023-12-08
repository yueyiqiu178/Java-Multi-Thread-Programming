package com.multi.thread.chapter2.section2.example14;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 下午3:58
 */
public class ThreadC extends Thread {

    private Service service;

    public ThreadC(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.printC();
    }
}
