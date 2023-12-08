package com.multi.thread.chapter3.section1.example8;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/15 下午10:28
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        ThreadB b = new ThreadB(lock);
        b.start();
        ThreadC c = new ThreadC(lock);
        c.start();
        Thread.sleep(1000);
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
    }
}
