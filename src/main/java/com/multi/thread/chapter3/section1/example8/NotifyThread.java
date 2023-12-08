package com.multi.thread.chapter3.section1.example8;

import com.multi.thread.chapter3.section1.example6.Service;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/14 下午10:46
 */
public class NotifyThread extends Thread {

    private Object lock;

    public NotifyThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            lock.notify();
//            lock.notify();
//            lock.notify();
//            lock.notify();
//            lock.notify();
//            lock.notify();
//            lock.notify();
//            lock.notify();
//            lock.notify();

//            lock.notifyAll();
        }
    }
}
