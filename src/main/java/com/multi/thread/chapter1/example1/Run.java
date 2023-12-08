package com.multi.thread.chapter1.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/04 下午9:22
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("结束运行");
    }
}
