package com.multi.thread.chapter4.section1.example5;

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

    public void await() {
        try {
            lock.lock();
            System.out.println("await时间为 " + System.currentTimeMillis());
            condition.await();
            System.out.println("ewait时间为 " + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signal() {
        try {
            lock.lock();
            System.out.println("signal时间为" + System.currentTimeMillis());
            condition.signal();
            Thread.sleep(2000);
            System.out.println("mignal时间为" + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
