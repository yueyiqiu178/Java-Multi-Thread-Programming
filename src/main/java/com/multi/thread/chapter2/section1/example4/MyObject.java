package com.multi.thread.chapter2.section1.example4;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午5:29
 */
public class MyObject {

    public synchronized void methodA() {
        try {
            System.out.println("begin methodA threadName = " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
