package com.multi.thread.chapter7.section2.example4;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 上午11:50
 */
public class Run {

    public static void main(String[] args) throws Exception {
        System.out.println("线程：" + Thread.currentThread().getName() + " 所在线程组名为：" + Thread.currentThread().getThreadGroup().getName());
        System.out.println("main线程所在的线程组的父线程组的名称是：" + Thread.currentThread().getThreadGroup().getParent().getName());
        System.out.println("main线程所在的线程组的父线程组的父线程组的名称是：" + Thread.currentThread().getThreadGroup().getParent().getParent().getName());
    }
}
