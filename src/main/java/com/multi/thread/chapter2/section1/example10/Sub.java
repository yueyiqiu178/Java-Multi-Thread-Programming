package com.multi.thread.chapter2.section1.example10;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午9:04
 */
public class Sub extends Main {

    @Override
    public synchronized void serviceMethod() {
        try {
            System.out.println("int sub 下一步 sleep begin threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int sub 下一步 sleep end threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            super.serviceMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
