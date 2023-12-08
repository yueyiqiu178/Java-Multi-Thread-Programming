package com.multi.thread.chapter2.section2.example19;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 下午6:31
 */
public class Service {

    public synchronized void methodA() {
        System.out.println("methodA begin");
        boolean isContinueRun = true;
        while (isContinueRun) {

        }
        System.out.println("methodA end");
    }

    public synchronized void methodB() {
        System.out.println("methodB begin");
        System.out.println("methodB end");
    }
}
