package com.multi.thread.chapter4.section2.example4;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/21 下午8:17
 */
public class Run {

    public static void main(String[] args) throws Exception {
        Service service = new Service();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(1000);
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
    }
}
