package com.multi.thread.chapter4.section1.example4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/19 下午9:48
 */
public class MyService {

    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void awaitMethod() {
        try {
            lock.lock();
            System.out.println("A");
            condition.await();
            System.out.println("B");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("锁释放了！");
        }
    }
}
