package com.multi.thread.chapter3.section1.example6;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/14 下午10:45
 */
public class ThreadA extends Thread {

    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
