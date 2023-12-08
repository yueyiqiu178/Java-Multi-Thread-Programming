package com.multi.thread.chapter2.section2.example12;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 下午1:43
 */
public class Service {

    public void testMethod1(MyObject object) {
        synchronized (object) {
            try {
                System.out.println("testMethod1____getLock time = " + System.currentTimeMillis() + "run ThreadName = " + Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("testMethod1 releasLock time = " + System.currentTimeMillis() + " run ThreadName = " + Thread.currentThread().getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
