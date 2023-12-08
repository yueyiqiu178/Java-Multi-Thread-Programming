package com.multi.thread.chapter2.section2.example13;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 下午1:57
 */
public class ThreadA extends Thread {

    @Override
    public void run() {
        Service.printA();
    }
}
