package com.multi.thread.chapter2.section2.example13;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 下午1:58
 */
public class Run {

    public static void main(String[] args) throws Exception {
        ThreadA a = new ThreadA();
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB();
        b.setName("B");
        b.start();
    }
}
