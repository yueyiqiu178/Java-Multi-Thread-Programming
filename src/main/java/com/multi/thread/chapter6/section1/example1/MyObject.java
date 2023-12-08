package com.multi.thread.chapter6.section1.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/23 上午10:45
 */
public class MyObject {

    private static MyObject myObject = new MyObject();

    private MyObject() {

    }

    public static MyObject getInstance() {
        return myObject;
    }
}
