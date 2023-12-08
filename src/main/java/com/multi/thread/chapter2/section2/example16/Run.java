package com.multi.thread.chapter2.section2.example16;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 下午3:59
 */
public class Run {

    public static void main(String[] args) throws Exception {
        Service service = new Service();
        Service service1 = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service1);
        b.setName("B");
        b.start();
    }
}
