package com.multi.thread.chapter3.section1.example10;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/15 下午10:43
 */
public class MyRun {

    private String lock = new String("");

    private Runnable runnableA = new Runnable() {
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("wait begin");
                    lock.wait();
                    System.out.println("wait end");
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
            }
        }
    };

    public static void main(String[] args) throws Exception {
        MyRun run = new MyRun();
        Thread a = new Thread(run.runnableA);
        a.start();
        Thread.sleep(100);
        Thread b = new Thread(run.runnableB);
        b.start();
    }
}
