package com.multi.thread.chapter1.example17;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/06 上午9:34
 */
public class Run1 {

    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        System.out.println("begin = " + System.currentTimeMillis());
        myThread.start();
        System.out.println("end = " + System.currentTimeMillis());
    }
}
