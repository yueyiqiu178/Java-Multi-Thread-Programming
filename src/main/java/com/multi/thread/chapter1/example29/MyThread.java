package com.multi.thread.chapter1.example29;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午3:22
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted()) {
                System.out.println("停止了");
                return;
            }
            System.out.println("timer = " + System.currentTimeMillis());
        }
    }
}
