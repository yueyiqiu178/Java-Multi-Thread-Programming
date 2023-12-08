package com.multi.thread.chapter7.section1.example2;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/23 上午11:52
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("begin sleep");
            Thread.sleep(10000);
            System.out.println("end sleep");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
