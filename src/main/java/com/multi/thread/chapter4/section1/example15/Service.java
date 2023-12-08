package com.multi.thread.chapter4.section1.example15;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/20 下午10:16
 */
public class Service {

    private ReentrantLock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            lock.lock();
            condition.await();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notifyMethod() {
        try {
            lock.lock();
            System.out.println("没有线程正在等待condition？" + lock.hasWaiters(condition) + " 线程数是多少？" + lock.getWaitQueueLength(condition));
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
}
