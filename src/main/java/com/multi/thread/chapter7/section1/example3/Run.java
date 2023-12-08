package com.multi.thread.chapter7.section1.example3;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/23 上午11:56
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyThread1 t1 = new MyThread1();
        t1.setName("a");
        t1.start();
        Thread.sleep(1000);
        MyThread2 t2 = new MyThread2();
        t2.setName("b");
        t2.start();
        Thread.sleep(1000);
        System.out.println("main方法中的t2状态：" + t2.getState());
    }
}
