package com.multi.thread.chapter2.section2.example20;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 下午6:31
 */
public class Service {

    Object object1 = new Object();

    public void methodA() {
        synchronized (object1) {
            System.out.println("methodA begin");
            boolean isContinueRun = true;
            while (isContinueRun) {

            }
            System.out.println("methodA end");
        }
    }

    Object object2 = new Object();
    public void methodB() {
        synchronized (object2) {
            System.out.println("methodB begin");
            System.out.println("methodB end");
        }
    }
}
