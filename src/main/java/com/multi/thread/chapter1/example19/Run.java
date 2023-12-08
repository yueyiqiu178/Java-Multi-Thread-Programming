package com.multi.thread.chapter1.example19;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/06 下午1:45
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (Exception e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
