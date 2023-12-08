package com.multi.thread.chapter2.section2.example24;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/12 上午9:48
 */
public class Run {

    public static void main(String[] args) throws Exception {
        final OuterClass.Inner inner = new OuterClass.Inner();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                inner.method1();
            }
        }, "A");
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                inner.method2();
            }
        }, "B");

        t1.start();
        t2.start();
    }
}
