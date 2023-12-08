package com.multi.thread.chapter7.section3.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 下午2:18
 */
public class Run {

    public static void main(String[] args) throws Exception {
        Object lock = new Object();
        MyThread a = new MyThread(lock, "A", 1);
        MyThread b = new MyThread(lock, "B", 2);
        MyThread c = new MyThread(lock, "C", 0);
        a.start();
        b.start();
        c.start();
    }
}
