package com.multi.thread.chapter7.section1.example4;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 上午9:27
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            synchronized (Lock.lock) {
                Lock.lock.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
