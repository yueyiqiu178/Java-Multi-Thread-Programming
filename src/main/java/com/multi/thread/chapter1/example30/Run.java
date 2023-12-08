package com.multi.thread.chapter1.example30;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午3:31
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(5000);
            thread.suspend();
            System.out.println("A = " + System.currentTimeMillis() + " i = " + thread.getI());
            Thread.sleep(5000);
            System.out.println("A = " + System.currentTimeMillis() + " i = " + thread.getI());
            thread.resume();
            Thread.sleep(5000);
            thread.suspend();
            System.out.println("B = " + System.currentTimeMillis() + " i = " + thread.getI());
            Thread.sleep(5000);
            System.out.println("B = " + System.currentTimeMillis() + " i = " + thread.getI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
