package com.multi.thread.chapter2.section2.example10;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 上午10:23
 */
public class MyThread2 extends Thread {

    private MyOneList list;

    public MyThread2(MyOneList list) {
        this.list = list;
    }

    @Override
    public void run() {
        MyService msRef = new MyService();
        msRef.addServiceMethod(list, "B");
    }
}
