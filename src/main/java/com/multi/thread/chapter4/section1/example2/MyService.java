package com.multi.thread.chapter4.section1.example2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/18 下午8:13
 */
public class MyService {

    private Lock lock = new ReentrantLock();

    public void methodA() {
        try {
            lock.lock();
            System.out.println("methodA begin ThreadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodA end ThreadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void methodB() {
        try {
            lock.lock();
            System.out.println("methodB begin ThreadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodB end ThreadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
