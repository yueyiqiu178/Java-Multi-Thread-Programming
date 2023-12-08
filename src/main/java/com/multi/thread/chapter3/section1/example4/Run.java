package com.multi.thread.chapter3.section1.example4;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/14 下午5:03
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(50);
            ThreadB b = new ThreadB(lock);
            b.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
