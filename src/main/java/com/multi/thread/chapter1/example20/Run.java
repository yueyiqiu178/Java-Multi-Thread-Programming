package com.multi.thread.chapter1.example20;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/06 下午1:49
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            //Thread.currentThread().interrupt();
            System.out.println("是否停止1 ？= " + thread.interrupted());
            System.out.println("是否停止2 ？= " + thread.interrupted());
        } catch (Exception e) {
            System.out.println("main catch");
            e.printStackTrace();
            System.out.println("end !");
        }
    }
}
