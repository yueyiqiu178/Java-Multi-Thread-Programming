package com.multi.thread.chapter3.section2.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 下午12:16
 */
public class Test2 {

    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.join();
        System.out.println("我想当myThread对象执行完毕之后我再执行，我做到了");
    }
}
