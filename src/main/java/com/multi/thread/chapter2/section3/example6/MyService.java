package com.multi.thread.chapter2.section3.example6;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/13 下午3:00
 */
public class MyService {

    public static AtomicLong aiRef = new AtomicLong();

    public synchronized void addNum() {
        System.out.println(Thread.currentThread().getName() + "加了100之后的值是：" + aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}
