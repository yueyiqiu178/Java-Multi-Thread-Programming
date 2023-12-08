package com.multi.thread.chapter3.section1.example12;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/15 下午10:59
 */
public class ThreadSubtract extends Thread {

    private Subtract r;

    public ThreadSubtract(Subtract r) {
        this.r = r;
    }

    @Override
    public void run() {
        r.subtract();
    }
}
