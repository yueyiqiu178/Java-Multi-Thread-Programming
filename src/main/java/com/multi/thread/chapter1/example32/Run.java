package com.multi.thread.chapter1.example32;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午3:49
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("main end");
        } catch (Exception e) {

        }
    }
}
