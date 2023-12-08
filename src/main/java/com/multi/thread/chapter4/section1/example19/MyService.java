package com.multi.thread.chapter4.section1.example19;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/21 下午7:32
 */
public class MyService {

    public ReentrantLock lock = new ReentrantLock();

    public Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            //lock.lock();
            lock.lockInterruptibly();
            System.out.println("lock begin " + Thread.currentThread().getName());
            for (int i = 0; i < Integer.MAX_VALUE/ 10; i++) {
                String newString = new String();
                Math.random();
            }
            System.out.println("lock end " + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}
