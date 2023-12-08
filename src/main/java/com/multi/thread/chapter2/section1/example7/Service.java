package com.multi.thread.chapter2.section1.example7;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午8:32
 */
public class Service {

    public synchronized void service1() {
        System.out.println("service1");
        service2();
    }

    public synchronized void service2() {
        System.out.println("service2");
        service3();
    }

    public synchronized void service3() {
        System.out.println("service3");
    }
}
