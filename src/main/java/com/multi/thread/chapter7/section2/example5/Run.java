package com.multi.thread.chapter7.section2.example5;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 上午11:56
 */
public class Run {

    public static void main(String[] args) throws Exception {
        System.out.println("线程组名称：" + Thread.currentThread().getThreadGroup().getName());
        System.out.println("线程组中活动的线程数量：" + Thread.currentThread().getThreadGroup().activeCount());
        System.out.println("线程组中活动的线程数量-加之前：" + Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup newGroup = new ThreadGroup(Thread.currentThread().getThreadGroup(), "newGroup");
        System.out.println("线程组中活动的线程数量-加之后：" + Thread.currentThread().getThreadGroup().activeGroupCount());
        System.out.println("父线程组名称：" + Thread.currentThread().getThreadGroup().getParent().getName());
    }
}
