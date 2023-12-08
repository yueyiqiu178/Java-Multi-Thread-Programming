package com.multi.thread.chapter1.example39;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午9:16
 */
public class MyThread extends Thread {

    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i = " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
