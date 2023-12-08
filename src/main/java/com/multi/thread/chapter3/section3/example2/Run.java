package com.multi.thread.chapter3.section3.example2;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/17 下午6:25
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            ThreadA a = new ThreadA();
            ThreadB b = new ThreadB();
            a.start();
            b.start();
            for (int i = 0; i < 100; i++) {
                Tools.tl.set("Main " + (i + 1));
                System.out.println("Main get value = " + Tools.tl.get());
                Thread.sleep(200);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
