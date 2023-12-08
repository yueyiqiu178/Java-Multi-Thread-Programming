package com.multi.thread.chapter2.section3.example5;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/13 下午2:57
 */
public class Run {

    public static void main(String[] args) throws Exception {
        AddCountThread countService = new AddCountThread();
        Thread t1 = new Thread(countService);
        t1.start();
        Thread t2 = new Thread(countService);
        t2.start();
        Thread t3 = new Thread(countService);
        t3.start();
        Thread t4 = new Thread(countService);
        t4.start();
        Thread t5 = new Thread(countService);
        t5.start();
    }
}
