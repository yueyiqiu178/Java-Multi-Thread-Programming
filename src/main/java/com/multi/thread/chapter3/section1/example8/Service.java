package com.multi.thread.chapter3.section1.example8;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/14 下午10:41
 */
public class Service {

    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait() ThreadName = " + Thread.currentThread().getName());
                lock.wait();
                System.out.println("end wait() ThreadName = " + Thread.currentThread().getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
