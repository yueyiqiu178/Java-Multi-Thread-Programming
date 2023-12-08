package com.multi.thread.chapter3.section2.example4;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 下午12:24
 */
public class ThreadC extends Thread {

    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        threadB.bService();
    }
}
