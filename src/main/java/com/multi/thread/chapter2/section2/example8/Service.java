package com.multi.thread.chapter2.section2.example8;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 上午9:54
 */
public class Service {

    private String anyString = new String();

    public void a() {
        try {
            synchronized (anyString) {
                System.out.println("a begin");
                Thread.sleep(3000);
                System.out.println("a end");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void b() {
        System.out.println("b begin");
        System.out.println("b end");
    }
}
