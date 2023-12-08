package com.multi.thread.chapter4.section1.example21;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/21 下午7:32
 */
public class MyService {

    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)) {
                System.out.println(" " + Thread.currentThread().getName() + "获得锁时间：" + System.currentTimeMillis());
                Thread.sleep(10000);
            } else {
                System.out.println(" " + Thread.currentThread().getName() + "没有获得锁");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}
