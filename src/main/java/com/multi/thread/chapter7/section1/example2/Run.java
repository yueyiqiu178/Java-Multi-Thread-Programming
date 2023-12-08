package com.multi.thread.chapter7.section1.example2;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/23 上午11:53
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            MyThread t = new MyThread();
            t.start();
            Thread.sleep(1000);
            System.out.println("main方法中的状态：" + t.getState());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
