package com.multi.thread.chapter2.section2.example11;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 下午1:33
 */
public class Service {

	synchronized public void testMethod1(MyObject object) {
        //synchronized (object) {
            try {
                System.out.println("testMethod1======getLock time =     " + System.currentTimeMillis() + "run ThreadName = " + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("testMethod1======releaseLock time = " + System.currentTimeMillis() + "run ThreadName = " + Thread.currentThread().getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        //}
    }
}
