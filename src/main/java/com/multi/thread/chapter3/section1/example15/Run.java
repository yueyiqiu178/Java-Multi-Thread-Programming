package com.multi.thread.chapter3.section1.example15;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午11:25
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c = new C(myStack);
        PThread pThread = new PThread(p);
        CThread cThread = new CThread(c);
        pThread.start();
        cThread.start();
    }
}
