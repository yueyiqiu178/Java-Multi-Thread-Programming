package com.multi.thread.chapter3.section1.example13;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午10:53
 */
public class ThreadP extends Thread {

    private P p;

    public ThreadP(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.setValue();
        }
    }
}
