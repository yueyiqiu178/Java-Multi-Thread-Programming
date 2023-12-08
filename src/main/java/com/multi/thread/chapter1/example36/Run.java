package com.multi.thread.chapter1.example36;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午8:51
 */
public class Run {

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++) {
            MyThread1 myThread1 = new MyThread1();
            myThread1.setPriority(1);
            myThread1.start();
            MyThread2 myThread2 = new MyThread2();
            myThread2.setPriority(10);
            myThread2.start();
        }
    }
}
