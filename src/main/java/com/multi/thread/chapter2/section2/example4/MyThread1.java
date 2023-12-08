package com.multi.thread.chapter2.section2.example4;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/10 下午5:43
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
