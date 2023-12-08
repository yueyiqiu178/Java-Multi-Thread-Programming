package com.multi.thread.chapter3.section2.example5;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/17 下午1:59
 */
public class RunFirst {

    public static void main(String[] args) throws Exception {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            b.start();
            System.out.println("main end" + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
