package com.multi.thread.chapter3.section2.example2;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 下午12:28
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            ThreadB b = new ThreadB();
            b.start();
            Thread.sleep(500);
            ThreadC c = new ThreadC(b);
            c.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
