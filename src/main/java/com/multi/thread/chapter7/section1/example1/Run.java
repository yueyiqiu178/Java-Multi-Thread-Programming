package com.multi.thread.chapter7.section1.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/23 上午11:46
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            MyThread t = new MyThread();
            System.out.println("main方法中的状态1：" + t.getState());
            Thread.sleep(1000);
            t.start();
            Thread.sleep(1000);
            System.out.println("main方法中的状态2：" + t.getState());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
