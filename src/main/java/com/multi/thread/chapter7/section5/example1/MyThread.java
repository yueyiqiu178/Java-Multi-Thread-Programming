package com.multi.thread.chapter7.section5.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 下午5:46
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        String username = null;
        System.out.println(username.hashCode());
    }
}
