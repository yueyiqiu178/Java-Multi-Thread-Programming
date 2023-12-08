package com.multi.thread.chapter3.section1.example15;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午11:25
 */
public class Run3 {

    public static void main(String[] args) throws Exception {
        MyStack myStack = new MyStack();
        P p1 = new P(myStack);
        P p2 = new P(myStack);
        P p3 = new P(myStack);
        P p4 = new P(myStack);
        P p5 = new P(myStack);
        P p6 = new P(myStack);
        PThread pThread1 = new PThread(p1);
        PThread pThread2 = new PThread(p2);
        PThread pThread3 = new PThread(p3);
        PThread pThread4 = new PThread(p4);
        PThread pThread5 = new PThread(p5);
        PThread pThread6 = new PThread(p6);
        pThread1.start();
        pThread2.start();
        pThread3.start();
        pThread4.start();
        pThread5.start();
        pThread6.start();
        C c = new C(myStack);
        CThread cThread = new CThread(c);
        cThread.start();
    }
}
