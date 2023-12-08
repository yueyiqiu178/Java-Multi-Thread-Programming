package com.multi.thread.chapter3.section1.example12;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/15 下午10:59
 */
public class ThreadAdd extends Thread {

    private Add p;

    public ThreadAdd(Add p) {
        this.p = p;
    }

    @Override
    public void run() {
        p.add();
    }
}
