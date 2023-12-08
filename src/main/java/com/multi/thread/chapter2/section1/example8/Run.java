package com.multi.thread.chapter2.section1.example8;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午8:41
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyThread t = new MyThread();
        t.start();
    }
}
