package com.multi.thread.chapter3.section1.example9;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/15 下午10:36
 */
public class MyRunnable {

    private static Object lock = new Object();

    private static Runnable runnable1 = new Runnable() {
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("wait begin timer = " + System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("wait end timer =   " + System.currentTimeMillis());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

    private static Runnable runnable2 = new Runnable() {
        public void run() {
            synchronized (lock) {
                System.out.println("notify begin timer = " + System.currentTimeMillis());
                lock.notify();
                System.out.println("notify end timer =   " + System.currentTimeMillis());
            }
        }
    };

    public static void main(String[] args) throws Exception {
        Thread t = new Thread(runnable1);
        t.start();
        Thread.sleep(3000);
        Thread t2 = new Thread(runnable2);
        t2.start();
    }
}
