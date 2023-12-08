package com.multi.thread.chapter2.section1.example2;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午5:05
 */
public class ThreadB extends Thread {

    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef) {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}
