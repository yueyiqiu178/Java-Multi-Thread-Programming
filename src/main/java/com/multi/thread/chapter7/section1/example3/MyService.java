package com.multi.thread.chapter7.section1.example3;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/23 上午11:55
 */
public class MyService {

    public static synchronized void serviceMethod() {
        try {
            System.out.println(Thread.currentThread().getName() + "进入了业务方法！");
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
