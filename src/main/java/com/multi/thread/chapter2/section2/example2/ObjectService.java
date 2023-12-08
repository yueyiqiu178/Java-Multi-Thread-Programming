package com.multi.thread.chapter2.section2.example2;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/10 下午5:06
 */
public class ObjectService {

    public void serviceMethod() {
        try {
            synchronized (this) {
                System.out.println("begin time = " + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("end time = " + System.currentTimeMillis());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
