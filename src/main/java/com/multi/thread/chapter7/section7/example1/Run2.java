package com.multi.thread.chapter7.section7.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 下午6:21
 */
public class Run2 {

    public static void main(String[] args) throws Exception {
        MyThreadGroup group = new MyThreadGroup("我的线程组");
        MyThread myThread = new MyThread(group, "我的线程");
        //myThread.setUncaughtExceptionHandler(new ObjectUncatchExceptionHandler());
        //MyThread.setDefaultUncaughtExceptionHandler(new StateUncatchExceptionHandler());
        myThread.start();
    }
}
