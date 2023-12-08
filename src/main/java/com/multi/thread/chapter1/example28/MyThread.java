package com.multi.thread.chapter1.example28;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午3:16
 */
public class MyThread extends Thread {

    private SynchronizedObject object;

    public MyThread(SynchronizedObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b", "bb");
    }
}
