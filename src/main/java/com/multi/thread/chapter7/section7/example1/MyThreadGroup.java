package com.multi.thread.chapter7.section7.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 下午6:15
 */
public class MyThreadGroup extends ThreadGroup {

    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        System.out.println("线程组的异常处理");
        e.printStackTrace();
    }
}
