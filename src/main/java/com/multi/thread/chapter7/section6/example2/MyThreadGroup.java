package com.multi.thread.chapter7.section6.example2;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 下午6:04
 */
public class MyThreadGroup extends ThreadGroup {

    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        super.uncaughtException(t, e);
        this.interrupt();
    }
}
