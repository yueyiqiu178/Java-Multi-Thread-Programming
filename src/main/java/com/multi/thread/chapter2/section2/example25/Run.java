package com.multi.thread.chapter2.section2.example25;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/12 上午10:01
 */
public class Run {

    public static void main(String[] args) throws Exception {
        final OutClass.InnerClass1 int1 = new OutClass.InnerClass1();
        final OutClass.InnerClass2 int2 = new OutClass.InnerClass2();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                int1.method1(int2);
            }
        }, "T1");

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                int1.method2();
            }
        }, "T2");

        Thread t3 = new Thread(new Runnable() {
            public void run() {
                int2.method1();
            }
        }, "T3");

        t1.start();
        t2.start();
        t3.start();
    }
}
