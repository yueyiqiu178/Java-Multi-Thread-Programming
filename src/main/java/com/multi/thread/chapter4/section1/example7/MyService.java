package com.multi.thread.chapter4.section1.example7;

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

    public Condition conditionA = lock.newCondition();

    public Condition conditionB = lock.newCondition();

    public void awaitA() {
        try {
            lock.lock();
            System.out.println("begin awaitA时间为" + System.currentTimeMillis() + " ThreadName = " + Thread.currentThread().getName());
            conditionA.await();
            System.out.println("end awaitA时间为" + System.currentTimeMillis() + " ThreadName = " + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB() {
        try {
            lock.lock();
            System.out.println("begin awaitB时间为" + System.currentTimeMillis() + " ThreadName = " + Thread.currentThread().getName());
            conditionB.await();
            System.out.println("end awaitB时间为" + System.currentTimeMillis() + " ThreadName = " + Thread.currentThread().getName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void siainalAll_A() {
        try {
            lock.lock();
            System.out.println("siainalAll_A时间为" + System.currentTimeMillis() + " ThreadName = " + Thread.currentThread().getName());
            conditionA.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void siainalAll_B() {
        try {
            lock.lock();
            System.out.println("siainalAll_B时间为" + System.currentTimeMillis() + " ThreadName = " + Thread.currentThread().getName());
            conditionB.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
