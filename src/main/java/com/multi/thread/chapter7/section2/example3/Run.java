package com.multi.thread.chapter7.section2.example3;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 上午11:40
 */
public class Run {

    public static void main(String[] args) throws Exception {
        System.out.println("A处线程：" + Thread.currentThread().getName() + " 所属的线程组名为：" + Thread.currentThread().getThreadGroup().getName() + " 中有线程组数量：" + Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup group = new ThreadGroup("新的组");
        System.out.println("B处线程：" + Thread.currentThread().getName() + " 所属的线程组名为：" + Thread.currentThread().getThreadGroup().getName() + " 中有线程组数量：" + Thread.currentThread().getThreadGroup().activeGroupCount());
        ThreadGroup[] threadGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadGroup);
        for (int i = 0; i < threadGroup.length; i++) {
            System.out.println("第一个线程组名称为：" + threadGroup[i].getName());
        }
    }
}
