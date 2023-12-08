package com.multi.thread.chapter6.section1.example8;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/23 上午10:50
 */
public class MyObject {

    private static class MyObjectHandler {
        private static MyObject myObject = new MyObject();
    }

    private MyObject() {

    }

    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }
}
