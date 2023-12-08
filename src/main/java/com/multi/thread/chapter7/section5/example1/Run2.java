package com.multi.thread.chapter7.section5.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 下午5:48
 */
public class Run2 {

    public static void main(String[] args) throws Exception {
        MyThread t1 = new MyThread();
        t1.setName("线程t1");
        t1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("线程：" + t.getName() + "出现了异常；");
                e.printStackTrace();
            }
        });
        t1.start();

        MyThread t2 = new MyThread();
        t2.setName("线程t2");
        t2.start();
    }
}
