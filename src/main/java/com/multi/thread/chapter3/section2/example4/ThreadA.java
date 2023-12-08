package com.multi.thread.chapter3.section2.example4;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/17 下午12:01
 */
public class ThreadA extends Thread {

    private ThreadB b;

    public ThreadA(ThreadB b) {
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
                b.start();
                b.join();
                //Thread.sleep(6000);
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    String newString = new String();
                    Math.random();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
