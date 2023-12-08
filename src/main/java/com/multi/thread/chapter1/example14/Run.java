package com.multi.thread.chapter1.example14;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/05 下午4:18
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        System.out.println("begin==" + myThread.isAlive());
        myThread.start();
//        Thread.sleep(1000);
        System.out.println("end==" + myThread.isAlive());
    }
}
