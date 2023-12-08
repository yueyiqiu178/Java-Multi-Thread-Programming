package com.multi.thread.chapter2.section2.example9;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 上午10:06
 */
public class Test {

    public static void main(String[] args) throws Exception {
        MyList myList = new MyList();
        MyThreadA a = new MyThreadA(myList);
        a.setName("A");
        a.start();
        MyThreadB b = new MyThreadB(myList);
        b.setName("B");
        b.start();
    }
}
