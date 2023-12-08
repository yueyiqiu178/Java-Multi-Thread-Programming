package com.multi.thread.chapter1.example35;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午8:42
 */
public class Run {

    public static void main(String[] args) throws Exception {
        System.out.println("main thread begin priority" + Thread.currentThread().getPriority());
        //Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority" + Thread.currentThread().getPriority());
        MyThread1 thread1 = new MyThread1();
        thread1.start();
    }
}
