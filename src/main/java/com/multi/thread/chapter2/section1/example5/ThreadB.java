package com.multi.thread.chapter2.section1.example5;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午5:31
 */
public class ThreadB extends Thread {

    private MyObject object;

    public ThreadB(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodB();
    }
}
