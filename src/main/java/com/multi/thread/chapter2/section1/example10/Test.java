package com.multi.thread.chapter2.section1.example10;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午9:06
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Sub subRef = new Sub();
        MyThreadA a = new MyThreadA(subRef);
        a.setName("A");
        a.start();
        MyThreadB b = new MyThreadB(subRef);
        b.setName("B");
        b.start();
    }
}
