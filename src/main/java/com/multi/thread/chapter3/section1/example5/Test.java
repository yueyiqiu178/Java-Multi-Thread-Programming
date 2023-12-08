package com.multi.thread.chapter3.section1.example5;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/14 下午10:24
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        ThreadB b = new ThreadB(lock);
        b.start();
    }
}
