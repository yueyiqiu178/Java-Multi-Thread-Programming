package com.multi.thread.chapter2.section2.example4;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/10 下午5:41
 */
public class Task {

    public void doLongTimeTask() {
        for (int i = 0; i < 100; i++) {
            System.out.println("no synchronized threadName = " + Thread.currentThread().getName() + " i = " + (i + 1));
        }
        System.out.println("");
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized threadName = " + Thread.currentThread().getName() + " i = " + (i + 1));
            }
        }
    }
}
