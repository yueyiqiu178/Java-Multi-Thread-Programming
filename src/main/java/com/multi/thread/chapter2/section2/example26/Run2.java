package com.multi.thread.chapter2.section2.example26;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/12 下午12:43
 */
public class Run2 {

    public static void main(String[] args) throws Exception {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
