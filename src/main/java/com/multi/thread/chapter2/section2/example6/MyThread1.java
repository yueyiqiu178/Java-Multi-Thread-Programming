package com.multi.thread.chapter2.section2.example6;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/10 下午7:35
 */
public class MyThread1 extends Thread {

    private Task task;

    public MyThread1(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
