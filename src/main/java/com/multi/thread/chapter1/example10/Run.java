package com.multi.thread.chapter1.example10;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/05 上午11:08
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);
        Thread t3 = new Thread(myThread);
        Thread t4 = new Thread(myThread);
        Thread t5 = new Thread(myThread);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
