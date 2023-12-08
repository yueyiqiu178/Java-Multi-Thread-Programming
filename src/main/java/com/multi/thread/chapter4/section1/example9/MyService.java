package com.multi.thread.chapter4.section1.example9;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/20 下午2:02
 */
public class MyService {

    private ReentrantLock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    private boolean hasValue = false;

    public void set() {
        try {
            lock.lock();
            while (hasValue == true) {
                System.out.println("有可能AA连续");
                condition.await();
            }
            System.out.println("打印A");
            hasValue = true;
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void get() {
        try {
            lock.lock();
            while (hasValue == false) {
                System.out.println("有可能BB连续");
                condition.await();
            }
            System.out.println("打印B");
            hasValue = false;
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
