package com.multi.thread.chapter1.example12;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/05 下午4:10
 */
public class Run2 {

    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        myThread.start();
        //myThread.run();
    }
}
