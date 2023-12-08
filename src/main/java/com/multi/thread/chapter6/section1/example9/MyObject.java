package com.multi.thread.chapter6.section1.example9;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/23 上午11:07
 */
public class MyObject implements Serializable {

    private static final long serialVersionUID = 888L;

    private static class MyObjectHandler {
        private static final MyObject myObject = new MyObject();
    }

    private MyObject() {

    }

    public static MyObject getInstance() {
        return MyObjectHandler.myObject;
    }

    protected Object readResolve() throws ObjectStreamException {
        System.out.println("调用了readResolve方法！");
        return MyObjectHandler.myObject;
    }
}
