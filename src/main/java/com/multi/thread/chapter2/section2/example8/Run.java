package com.multi.thread.chapter2.section2.example8;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 上午9:58
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
    }
}
