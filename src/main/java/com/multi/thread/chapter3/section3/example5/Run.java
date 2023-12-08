package com.multi.thread.chapter3.section3.example5;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/17 下午6:25
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在Main线程中获取值=" + Tools.tl.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
