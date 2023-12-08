package com.multi.thread.chapter3.section2.example4;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/17 下午12:01
 */
public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("b run begin timer =  " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("b run end timer =    " + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void bService() {
        System.out.println("打印了bService time = " + System.currentTimeMillis());
    }
}
