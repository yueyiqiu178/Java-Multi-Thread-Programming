package com.multi.thread.chapter1.example3;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/04 下午9:33
 */
public class Test {

    public static void main(String[] args) throws Exception {
        MyThread mt1 = new MyThread(1);
        MyThread mt2 = new MyThread(2);
        MyThread mt3 = new MyThread(3);
        MyThread mt4 = new MyThread(4);
        MyThread mt5 = new MyThread(5);
        MyThread mt6 = new MyThread(6);
        MyThread mt7 = new MyThread(7);
        MyThread mt8 = new MyThread(8);
        MyThread mt9 = new MyThread(9);
        MyThread mt10 = new MyThread(10);
        MyThread mt11 = new MyThread(11);
        MyThread mt12 = new MyThread(12);
        MyThread mt13 = new MyThread(13);
        MyThread mt14 = new MyThread(14);
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
        mt5.start();
        mt6.start();
        mt7.start();
        mt8.start();
        mt9.start();
        mt10.start();
        mt11.start();
        mt12.start();
        mt13.start();
        mt14.start();
    }
}
