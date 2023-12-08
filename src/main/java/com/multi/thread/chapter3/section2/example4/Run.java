package com.multi.thread.chapter3.section2.example4;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/17 下午12:05
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            Thread.sleep(1000);
            ThreadC c = new ThreadC(b);
            c.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
