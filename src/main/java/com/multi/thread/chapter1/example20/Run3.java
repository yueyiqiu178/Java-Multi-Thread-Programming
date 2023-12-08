package com.multi.thread.chapter1.example20;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/06 下午1:54
 */
public class Run3 {

    public static void main(String[] args) throws Exception {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止1 ？= " + thread.isInterrupted());
            System.out.println("是否停止2 ？= " + thread.isInterrupted());
        } catch (Exception e) {
            System.out.println("main catch");
            e.printStackTrace();
            System.out.println("end !");
        }
    }
}
