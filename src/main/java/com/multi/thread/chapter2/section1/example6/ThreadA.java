package com.multi.thread.chapter2.section1.example6;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午8:22
 */
public class ThreadA extends Thread {

    private PublicVar publicVar;

    public ThreadA(PublicVar publicVar) {
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B", "BB");
    }
}
