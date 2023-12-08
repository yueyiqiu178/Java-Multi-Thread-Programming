package com.multi.thread.chapter1.example31;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午3:39
 */
public class SynchronizedObject {

    public synchronized void printString() {
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("a线程永远的suspend了");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
