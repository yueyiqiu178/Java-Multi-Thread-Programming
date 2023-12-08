package com.multi.thread.chapter2.section1.example5;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午5:41
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(object);
        a.setName("A");
        ThreadB b = new ThreadB(object);
        b.setName("B");
        a.start();
        b.start();
    }
}
