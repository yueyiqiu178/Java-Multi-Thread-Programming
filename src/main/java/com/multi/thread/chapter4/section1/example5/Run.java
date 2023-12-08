package com.multi.thread.chapter4.section1.example5;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/19 下午9:57
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(3000);
        service.signal();
    }
}
