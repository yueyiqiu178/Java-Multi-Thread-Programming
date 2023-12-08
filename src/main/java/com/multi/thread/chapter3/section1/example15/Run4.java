package com.multi.thread.chapter3.section1.example15;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午11:25
 */
public class Run4 {

    public static void main(String[] args) throws Exception {
        MyStack myStack = new MyStack();
        C c1 = new C(myStack);
        C c2 = new C(myStack);
        C c3 = new C(myStack);
        C c4 = new C(myStack);
        C c5 = new C(myStack);
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
