package com.multi.thread.chapter7.section7.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 下午6:18
 */
public class Run1 {

    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        //myThread.setUncaughtExceptionHandler(new ObjectUncatchExceptionHandler());
        MyThread.setDefaultUncaughtExceptionHandler(new StateUncatchExceptionHandler());
        myThread.start();
    }
}
