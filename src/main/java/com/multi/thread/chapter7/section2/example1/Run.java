package com.multi.thread.chapter7.section2.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 上午9:41
 */
public class Run {

    public static void main(String[] args) throws Exception {
        ThreadA aRunnable = new ThreadA();
        ThreadB bRunnable = new ThreadB();
        ThreadGroup group = new ThreadGroup("高洪岩的线程组");
        Thread aThread = new Thread(group, aRunnable);
        Thread bThread = new Thread(group, bRunnable);
        aThread.start();
        bThread.start();
        System.out.println("活动的线程数为：" + group.activeCount());
        System.out.println("线程组的名称为：" + group.getName());
    }
}
