package com.multi.thread.chapter1.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/04 下午9:21
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}
