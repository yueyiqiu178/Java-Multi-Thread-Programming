package com.multi.thread.chapter7.section6.example2;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 下午5:46
 */
public class MyThread extends Thread {

    private String num;

    public MyThread(ThreadGroup group, String name, String num) {
        super(group, name);
        this.num = num;
    }

    @Override
    public void run() {
        int numInt = Integer.parseInt(num);
        while (this.isInterrupted() == false) {
            System.out.println("死循环中：" + Thread.currentThread().getName());
        }
    }
}
