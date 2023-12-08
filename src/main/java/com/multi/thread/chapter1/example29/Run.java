package com.multi.thread.chapter1.example29;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午3:24
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyThread t = new MyThread();
        t.start();
        Thread.sleep(2000);
        t.interrupt();
    }
}
