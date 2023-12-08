package com.multi.thread.chapter7.section7.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 下午6:12
 */
public class MyThread extends Thread {

    private String num = "a";

    public MyThread() {
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        int numInt = Integer.parseInt(num);
        System.out.println("在线程中打印：" + (numInt + 1));
    }
}
