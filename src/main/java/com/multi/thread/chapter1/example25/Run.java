package com.multi.thread.chapter1.example25;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/06 下午10:40
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.interrupt();
        System.out.println("end!");
    }
}
