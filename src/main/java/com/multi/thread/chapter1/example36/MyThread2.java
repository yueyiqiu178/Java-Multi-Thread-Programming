package com.multi.thread.chapter1.example36;

import java.util.Random;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午8:47
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 50000; i++) {
                Random random = new Random();
                random.nextInt();
                addResult = addResult + 1;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("&&&&&&&&&&&&& thread 2 user time = " + (endTime - beginTime));
    }
}
