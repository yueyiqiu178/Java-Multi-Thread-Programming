package com.multi.thread.chapter3.section2.example3;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/17 上午11:56
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("begin timer = " + System.currentTimeMillis());
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
