package com.multi.thread.chapter4.section2.example1;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/21 下午8:15
 */
public class Service {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {
        try {
            try {
                lock.readLock().lock();
                System.out.println("获取读锁" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(60000);
            } finally {
                lock.readLock().unlock();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
