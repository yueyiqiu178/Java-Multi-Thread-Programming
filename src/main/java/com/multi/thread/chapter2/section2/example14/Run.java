package com.multi.thread.chapter2.section2.example14;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 下午3:59
 */
public class Run {

    public static void main(String[] args) throws Exception {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        ThreadC c = new ThreadC(service);
        c.setName("C");
        c.start();
    }
}
