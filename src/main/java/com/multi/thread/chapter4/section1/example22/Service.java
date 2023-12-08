package com.multi.thread.chapter4.section1.example22;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/21 下午7:53
 */
public class Service {

    private ReentrantLock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void testMethod() {
        try {
            lock.lock();
            System.out.println("wait begin");
            //condition.await();
            condition.awaitUninterruptibly();
            System.out.println("wait end");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("catch");
        } finally {
            lock.unlock();
        }
    }
}
