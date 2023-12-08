package com.multi.thread.chapter2.section2.example9;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 上午10:01
 */
public class MyList {

    private List list = new ArrayList();

    public synchronized void add(String username) {
        System.out.println("ThreadName = " + Thread.currentThread().getName() + "执行了add方法！");
        list.add(username);
        System.out.println("ThreadName = " + Thread.currentThread().getName() + "退出了add方法！");
    }

    public synchronized int getSize() {
        System.out.println("ThreadName = " + Thread.currentThread().getName() + "执行了getSize方法！");
        int sizeValue = list.size();
        System.out.println("ThreadName = " + Thread.currentThread().getName() + "退出了getSize方法！");
        return sizeValue;
    }
}
