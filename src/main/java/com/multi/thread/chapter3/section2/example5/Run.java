package com.multi.thread.chapter3.section2.example5;

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
            b.start();
            b.join(2000);
            System.out.println("main end" + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
