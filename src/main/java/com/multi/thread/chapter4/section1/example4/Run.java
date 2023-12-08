package com.multi.thread.chapter4.section1.example4;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/19 下午9:50
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
    }
}
