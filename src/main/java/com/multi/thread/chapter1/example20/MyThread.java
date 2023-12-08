package com.multi.thread.chapter1.example20;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/06 下午1:48
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i =0; i < 500000; i++) {
            System.out.println("i = " + (i + 1));
        }
    }
}
