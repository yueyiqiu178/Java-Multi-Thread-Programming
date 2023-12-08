package com.multi.thread.chapter1.example14;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/05 下午4:18
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("run = " + this.isAlive());
    }
}
