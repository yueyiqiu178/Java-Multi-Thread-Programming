package com.multi.thread.chapter1.example37;

import java.util.Random;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午8:47
 */
public class MyThread1 extends Thread {

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            random.nextInt();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("============= thread 1 user time = " + (endTime - beginTime));
    }
}
