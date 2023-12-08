package com.multi.thread.chapter4.section1.example14;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/20 下午10:06
 */
public class Service {

    public ReentrantLock lock = new ReentrantLock();

    public Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(Integer.MAX_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
