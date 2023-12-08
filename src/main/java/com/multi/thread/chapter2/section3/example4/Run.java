package com.multi.thread.chapter2.section3.example4;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/13 下午2:47
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyThread[] myThreads = new MyThread[100000];
        for (int i = 0; i < 100000; i++) {
            myThreads[i] = new MyThread();
        }
        for (int i = 0; i < 100000; i++) {
            myThreads[i].start();
        }
    }
}
