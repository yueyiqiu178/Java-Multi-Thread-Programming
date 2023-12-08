package com.multi.thread.chapter3.section1.example15;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午11:25
 */
public class Run2 {

    public static void main(String[] args) throws Exception {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c1 = new C(myStack);
        C c2 = new C(myStack);
        C c3 = new C(myStack);
        C c4 = new C(myStack);
        C c5 = new C(myStack);
        PThread pThread = new PThread(p);
        pThread.start();
        CThread cThread1 = new CThread(c1);
        CThread cThread2 = new CThread(c2);
        CThread cThread3 = new CThread(c3);
        CThread cThread4 = new CThread(c4);
        CThread cThread5 = new CThread(c5);
        cThread1.start();
        cThread2.start();
        cThread3.start();
        cThread4.start();
        cThread5.start();
    }
}
