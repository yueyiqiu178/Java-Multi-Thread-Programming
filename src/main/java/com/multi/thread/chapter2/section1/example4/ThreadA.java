package com.multi.thread.chapter2.section1.example4;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午5:31
 */
public class ThreadA extends Thread {

    private MyObject object;

    public ThreadA(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
