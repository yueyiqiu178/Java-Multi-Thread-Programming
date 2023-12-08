package com.multi.thread.chapter4.section1.example6;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/19 下午10:04
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(3000);
        service.siainalAll();
    }
}
