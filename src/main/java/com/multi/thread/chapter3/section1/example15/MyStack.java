package com.multi.thread.chapter3.section1.example15;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午11:17
 */
public class MyStack {

    private List list = new ArrayList();

    public synchronized void push() {
        try {
            while (list.size() == 1) {
                this.wait();
            }
            list.add("anyString = " + Math.random());
            this.notifyAll();
            System.out.println("push = " + list.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized String pop() {
        String returnValue = "";
        try {
            while (list.size() == 0) {
                System.out.println("pop操作中的：" + Thread.currentThread().getName() + "线程呈wait状态");
                this.wait();
            }
            returnValue = "" + list.get(0);
            list.remove(0);
            this.notifyAll();
            System.out.println("pop = " + list.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}
