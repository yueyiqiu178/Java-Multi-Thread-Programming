package com.multi.thread.chapter4.section2.example2;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/21 下午8:15
 */
public class Service {

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void write() {
        try {
            try {
                lock.writeLock().lock();
                System.out.println("获得写锁" + Thread.currentThread().getName() + " " + System.currentTimeMillis());
                Thread.sleep(5000);
            } finally {
                lock.writeLock().unlock();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
