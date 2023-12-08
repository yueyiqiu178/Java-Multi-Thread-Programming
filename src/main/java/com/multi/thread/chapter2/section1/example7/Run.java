package com.multi.thread.chapter2.section1.example7;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午8:35
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyThread thread = new MyThread();
        thread.start();
    }
}
