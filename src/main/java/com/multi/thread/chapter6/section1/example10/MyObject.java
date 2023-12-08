package com.multi.thread.chapter6.section1.example10;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/23 上午11:21
 */
public class MyObject {

    private static MyObject instance = null;

    private MyObject() {

    }

    static {
        instance = new MyObject();
    }

    public static MyObject getInstance() {
        return instance;
    }
}
