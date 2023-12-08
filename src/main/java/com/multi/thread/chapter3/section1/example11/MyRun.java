package com.multi.thread.chapter3.section1.example11;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/15 下午10:43
 */
public class MyRun {

    private String lock = new String("");

    private boolean isFirstRunB = false;

    private Runnable runnableA = new Runnable() {
        public void run() {
            try {
                synchronized (lock) {
                    while (isFirstRunB == false) {
                        System.out.println("wait begin");
                        lock.wait();
                        System.out.println("wait end");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

    private Runnable runnableB = new Runnable() {
        public void run() {
            synchronized (lock) {
                System.out.println("notify begin");
                lock.notify();
                System.out.println("notify end");
                isFirstRunB = true;
            }
        }
    };

    public static void main(String[] args) throws Exception {
        MyRun run = new MyRun();
        Thread a = new Thread(run.runnableB);
        a.start();
        Thread.sleep(100);
        Thread b = new Thread(run.runnableA);
        b.start();
    }
}
