package com.multi.thread.chapter6.section1.example5;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/23 上午10:50
 */
public class MyObject {

    private static MyObject myObject;

    private MyObject() {

    }

    public static MyObject getInstance() {
        try {
            synchronized (MyObject.class) {
                if (myObject != null) {
                } else {
                    Thread.sleep(3000);
                    myObject = new MyObject();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
