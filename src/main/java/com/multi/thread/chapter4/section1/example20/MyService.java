package com.multi.thread.chapter4.section1.example20;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/21 下午7:32
 */
public class MyService {

    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        if (lock.tryLock()) {
            System.out.println(Thread.currentThread().getName() + "获得锁");
        } else {
            System.out.println(Thread.currentThread().getName() + "没有获得锁");
        }
    }
}
