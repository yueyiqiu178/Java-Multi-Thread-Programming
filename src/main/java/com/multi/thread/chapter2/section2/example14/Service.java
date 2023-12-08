package com.multi.thread.chapter2.section2.example14;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 下午3:55
 */
public class Service {

    public static synchronized void printA() {
        try {
            System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printA");
            Thread.sleep(3000);
            System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开printA");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static synchronized void printB() {
        try {
            System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printB");
            System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开printB");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void printC() {
        System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入printC");
        System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开printC");
    }
}
