package com.multi.thread.chapter1.example3;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/04 下午9:32
 */
public class MyThread extends Thread {

    private int i;

    MyThread(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
