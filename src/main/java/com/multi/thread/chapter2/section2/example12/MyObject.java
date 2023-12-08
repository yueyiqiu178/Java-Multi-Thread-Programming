package com.multi.thread.chapter2.section2.example12;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 下午1:41
 */
public class MyObject {

    /*public synchronized void speedPrintString() {
        System.out.println("speedPringString______getLock time = " + System.currentTimeMillis() + "run ThreadName = " + Thread.currentThread().getName());
        System.out.println("------------------------");
        System.out.println("speedPrintString releaseLock time = " + System.currentTimeMillis() + "run ThreadName = " + Thread.currentThread().getName());
    }*/

    public void speedPrintString() {
        synchronized (this) {
            System.out.println("speedPringString______getLock time = " + System.currentTimeMillis() + "run ThreadName = " + Thread.currentThread().getName());
            System.out.println("------------------------");
            System.out.println("speedPrintString releaseLock time = " + System.currentTimeMillis() + "run ThreadName = " + Thread.currentThread().getName());
        }
    }
}
