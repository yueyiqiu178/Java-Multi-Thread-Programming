package com.multi.thread.chapter2.section2.example12;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 下午1:46
 */
public class ThreadB extends Thread {

    private MyObject object;

    public ThreadB(MyObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.speedPrintString();
    }
}
