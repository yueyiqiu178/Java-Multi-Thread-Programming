package com.multi.thread.chapter3.section1.example7;

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
                lock.wait();
                System.out.println("end wait()");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出现异常了，因为呈wait状态线程被interrupt了！");
        }
    }
}
