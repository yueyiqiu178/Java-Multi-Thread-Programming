package com.multi.thread.chapter7.section5.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 下午5:48
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyThread t = new MyThread();
        t.start();
    }
}
