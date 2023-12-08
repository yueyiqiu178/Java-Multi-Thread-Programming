package com.multi.thread.chapter2.section2.example12;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 下午1:47
 */
public class Run {

    public static void main(String[] args) throws Exception {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(service, object);
        a.setName("A");
        a.start();
        Thread.sleep(100);
        ThreadB b = new ThreadB(object);
        b.setName("B");
        b.start();
    }
}
