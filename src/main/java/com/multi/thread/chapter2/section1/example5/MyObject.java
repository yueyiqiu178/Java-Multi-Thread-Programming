package com.multi.thread.chapter2.section1.example5;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午5:29
 */
public class MyObject {

	synchronized public void methodA() {
        try {
            System.out.println("begin methodA threadName = " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end endTime = " + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	synchronized public void methodB() {
        try {
            System.out.println("begin methodB threadName = " + Thread.currentThread().getName() + " begin time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("end!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
