package com.multi.thread.chapter2.section1.example10;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午9:05
 */
public class MyThreadB extends Thread {

    private Sub sub;

    public MyThreadB(Sub sub) {
        super();
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
