package com.multi.thread.chapter7.section7.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 下午6:18
 */
public class StateUncatchExceptionHandler implements Thread.UncaughtExceptionHandler {

    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("静态的异常处理");
        e.printStackTrace();
    }
}
