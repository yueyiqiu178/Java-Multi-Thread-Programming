package com.multi.thread.chapter3.section1.example5;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/14 下午10:21
 */
public class Service {

    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait()");
                //lock.wait();
                Thread.sleep(5000);
                System.out.println("end wait()");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
