package com.multi.thread.chapter2.section1.example7;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午8:34
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
