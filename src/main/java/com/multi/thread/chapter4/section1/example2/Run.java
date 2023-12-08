package com.multi.thread.chapter4.section1.example2;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/18 下午8:25
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadAA aa = new ThreadAA(service);
        aa.setName("AA");
        aa.start();
        Thread.sleep(100);
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        ThreadBB bb = new ThreadBB(service);
        bb.setName("BB");
        bb.start();
    }
}
