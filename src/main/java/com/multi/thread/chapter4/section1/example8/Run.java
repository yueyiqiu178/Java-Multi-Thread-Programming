package com.multi.thread.chapter4.section1.example8;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/20 下午2:05
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyService service = new MyService();
        MyThreadA a = new MyThreadA(service);
        a.start();
        MyThreadB b = new MyThreadB(service);
        b.start();
    }
}
