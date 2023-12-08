package com.multi.thread.chapter3.section3.example3;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/17 下午6:25
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            ThreadA a = new ThreadA();
            a.start();
            Thread.sleep(1000);
            ThreadB b = new ThreadB();
            b.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
