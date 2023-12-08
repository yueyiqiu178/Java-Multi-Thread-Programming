package com.multi.thread.chapter4.section2.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/21 下午8:17
 */
public class Run {

    public static void main(String[] args) throws Exception {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
