package com.multi.thread.chapter1.example15;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/05 下午4:15
 */
public class Run {

    public static void main(String[] args) throws Exception {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        System.out.println("main begin t1 isAlive = " + t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive = " + t1.isAlive());
    }
}
