package com.multi.thread.chapter2.section2.example17;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 下午4:12
 */
public class Service {

    public static void print(String stringParam) {
        try {
            synchronized (stringParam) {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
