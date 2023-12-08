package com.multi.thread.chapter4.section1.example11;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/20 下午8:02
 */
public class Service {

    private ReentrantLock lock = new ReentrantLock();

    public void serviceMethod1() {
        try {
            lock.lock();
            System.out.println("serviceMethod1 getHoldCount = " + lock.getHoldCount());
            serviceMethod2();
        } finally {
            lock.unlock();
        }
    }

    public void serviceMethod2() {
        try {
            lock.lock();
            System.out.println("serviceMethod2 getHoldCount = " + lock.getHoldCount());
        } finally {
            lock.unlock();
        }
    }
}
