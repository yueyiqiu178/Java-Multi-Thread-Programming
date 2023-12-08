package com.multi.thread.chapter1.example7;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/05 上午9:41
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread, "B");
        Thread c = new Thread(myThread, "C");
        Thread d = new Thread(myThread, "D");
        Thread e = new Thread(myThread, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
