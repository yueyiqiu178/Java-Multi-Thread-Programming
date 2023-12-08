package com.multi.thread.chapter4.section1.example10;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/20 下午2:27
 */
public class Service {

    private ReentrantLock lock;

    public Service(boolean isFair) {
        this.lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            lock.lock();
            System.out.println("ThreadName = " + Thread.currentThread().getName() + "获得锁定");
        } finally {
            lock.unlock();
        }
    }
}
