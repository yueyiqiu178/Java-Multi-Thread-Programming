package com.multi.thread.chapter2.section1.example10;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午9:01
 */
public class Main {

    public synchronized void serviceMethod() {
        try {
            System.out.println("int main 下一步 sleep begin threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main 下一步 sleep end threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
