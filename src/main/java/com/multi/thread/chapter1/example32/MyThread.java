package com.multi.thread.chapter1.example32;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午3:48
 */
public class MyThread extends Thread {

    private long i = 0;

    @Override
    public void run() {
        while (true) {
            i++;
            System.out.println(i);
        }
    }
}
