package com.multi.thread.chapter2.section2.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/10 下午4:59
 */
public class MyThread2 extends Thread {

    private Task task;

    public MyThread2(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }
}
