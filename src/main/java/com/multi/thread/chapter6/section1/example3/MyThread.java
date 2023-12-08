package com.multi.thread.chapter6.section1.example3;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/23 上午10:46
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
