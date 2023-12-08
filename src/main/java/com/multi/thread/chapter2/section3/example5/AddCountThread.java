package com.multi.thread.chapter2.section3.example5;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/13 下午2:56
 */
public class AddCountThread extends Thread {

    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }
}
