package com.multi.thread.chapter4.section1.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/18 下午8:15
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyService service = new MyService();
        MyThread a1 = new MyThread(service);
        MyThread a2 = new MyThread(service);
        MyThread a3 = new MyThread(service);
        MyThread a4 = new MyThread(service);
        MyThread a5 = new MyThread(service);
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
    }
}
