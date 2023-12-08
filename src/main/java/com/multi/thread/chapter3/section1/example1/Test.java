package com.multi.thread.chapter3.section1.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/14 上午9:15
 */
public class Test {

    public static void main(String[] args) throws Exception {
        MyList list = new MyList();
        ThreadA a = new ThreadA(list);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(list);
        b.setName("B");
        b.start();
    }
}
