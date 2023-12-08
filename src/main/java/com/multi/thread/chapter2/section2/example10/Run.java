package com.multi.thread.chapter2.section2.example10;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 上午10:30
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyOneList list = new MyOneList();
        MyThread1 thread1 = new MyThread1(list);
        thread1.setName("A");
        thread1.start();
        MyThread2 thread2 = new MyThread2(list);
        thread2.setName("B");
        thread2.start();
        Thread.sleep(6000);
        System.out.println("listSize = " + list.getSize());
    }
}
