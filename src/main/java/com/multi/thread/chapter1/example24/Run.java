package com.multi.thread.chapter1.example24;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/06 下午10:40
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();
        } catch (Exception e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
