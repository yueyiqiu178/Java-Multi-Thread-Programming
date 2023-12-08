package com.multi.thread.chapter7.section3.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 下午2:08
 */
public class MyThread extends Thread {

    private Object lock;

    private String showChar;

    private int showNumPosition;

    private int printCount = 0;

    private static volatile int addNumber = 1;

    public MyThread(Object lock, String showChar, int showNumPosition) {
        this.lock = lock;
        this.showChar = showChar;
        this.showNumPosition = showNumPosition;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                while (true) {
                    if (addNumber % 3 == showNumPosition) {
                        System.out.println("ThreadName = " + Thread.currentThread().getName() + " runCount = " + addNumber + " " + showChar);
                        lock.notifyAll();
                        addNumber++;
                        printCount++;
                        if (printCount == 3) {
                            break;
                        }
                    } else {
                        lock.wait();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
