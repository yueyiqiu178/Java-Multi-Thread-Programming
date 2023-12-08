package com.multi.thread.chapter2.section2.example4;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/10 下午5:44
 */
public class Run {

    public static void main(String[] args) throws Exception {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.start();
        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
    }
}
