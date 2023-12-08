package com.multi.thread.chapter6.section1.example11;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/23 上午11:22
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyObject.connectionFactory.getConnection().hashCode());
        }
    }
}
