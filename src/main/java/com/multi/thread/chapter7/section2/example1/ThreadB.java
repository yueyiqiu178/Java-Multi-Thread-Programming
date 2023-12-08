package com.multi.thread.chapter7.section2.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 上午9:39
 */
public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("ThreadName = " + Thread.currentThread().getName());
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
