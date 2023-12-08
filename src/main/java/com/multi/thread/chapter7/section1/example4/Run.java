package com.multi.thread.chapter7.section1.example4;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 上午9:28
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            MyThread t = new MyThread();
            t.start();
            Thread.sleep(1000);
            System.out.println("main方法中的t状态：" + t.getState());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
