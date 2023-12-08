package com.multi.thread.chapter4.section1.example16;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/20 下午10:22
 */
public class Service {

    private ReentrantLock lock;

    public Service(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            lock.lock();
            System.out.println("公平锁情况：" + lock.isFair());
        } finally {
            lock.unlock();
        }
    }
}
