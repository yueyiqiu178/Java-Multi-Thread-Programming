package com.multi.thread.chapter2.section1.example8;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午8:36
 */
public class Main {

    public int i = 10;

    public synchronized void operateIMainMethod() {
        try {
            i--;
            System.out.println("main print i = " + i);
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
