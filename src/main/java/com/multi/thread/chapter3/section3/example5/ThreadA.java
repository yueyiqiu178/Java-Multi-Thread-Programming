package com.multi.thread.chapter3.section3.example5;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/17 下午6:23
 */
public class ThreadA extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在ThreadA线程中获取值=" + Tools.tl.get());
                Thread.sleep(100);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
