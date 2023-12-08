package com.multi.thread.chapter2.section2.example6;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/10 下午7:36
 */
public class Run {

    public static void main(String[] args) throws Exception {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.start();
        Thread.sleep(100);
        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
    }
}
