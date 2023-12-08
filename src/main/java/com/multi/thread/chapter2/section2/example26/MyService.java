package com.multi.thread.chapter2.section2.example26;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/12 下午12:36
 */
public class MyService {

    private String lock = "123";

    public void testMethod() {
        try {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
                lock = "456";
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " end " + System.currentTimeMillis());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
