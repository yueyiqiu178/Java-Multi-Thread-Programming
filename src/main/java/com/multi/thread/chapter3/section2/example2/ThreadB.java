package com.multi.thread.chapter3.section2.example2;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 下午12:24
 */
public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            ThreadA a = new ThreadA();
            a.start();
            a.join();
            System.out.println("线程B在run end处打印了");
        } catch (Exception e) {
            System.out.println("线程B在catch处打印了");
            e.printStackTrace();
        }
    }
}
