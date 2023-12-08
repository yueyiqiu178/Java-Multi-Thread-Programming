package com.multi.thread.chapter1.example6;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/05 上午9:38
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");
        a.start();
        b.start();
        c.start();
    }
}
