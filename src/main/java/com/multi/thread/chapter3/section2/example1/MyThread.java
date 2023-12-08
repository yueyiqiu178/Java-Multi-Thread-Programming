package com.multi.thread.chapter3.section2.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 下午12:15
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            int secondvalue = (int)(Math.random() * 10000);
            System.out.println(secondvalue);
            Thread.sleep(secondvalue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
