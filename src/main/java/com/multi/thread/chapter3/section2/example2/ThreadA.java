package com.multi.thread.chapter3.section2.example2;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 下午12:24
 */
public class ThreadA extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String newString = new String();
            Math.random();
        }
    }
}
