package com.multi.thread.chapter3.section4.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/18 上午9:34
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在Main线程中取值 = " + Tools.tl.get());
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
