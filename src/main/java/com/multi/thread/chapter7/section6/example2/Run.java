package com.multi.thread.chapter7.section6.example2;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 下午5:48
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyThreadGroup group = new MyThreadGroup("我的线程组");
        MyThread[] myThreads = new MyThread[10];
        for (int i = 0; i < myThreads.length; i++) {
            myThreads[i] = new MyThread(group, "线程" + (i + 1), "1");
            myThreads[i].start();
        }

        MyThread newT = new MyThread(group, "报错线程", "a");
        newT.start();
    }
}
