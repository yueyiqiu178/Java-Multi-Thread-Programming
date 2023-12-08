package com.multi.thread.chapter1.example34;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午8:24
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyThread thread = new MyThread();
        thread.start();
    }
}
