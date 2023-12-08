package com.multi.thread.chapter2.section2.example5;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/10 下午7:27
 */
public class ObjectService {

    public void serviceMethodA() {
        try {
            synchronized (this) {
                System.out.println("A begin time = " + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("A end time =   " + System.currentTimeMillis());
            }
            Thread.sleep(1000);            System.out.println("out A");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void serviceMethodB() {
    	
    	try {
        synchronized (this) {
            System.out.println("B begin time = " + System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println("B end time =   " + System.currentTimeMillis());
        }
        System.out.println("out B");
    	}
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
