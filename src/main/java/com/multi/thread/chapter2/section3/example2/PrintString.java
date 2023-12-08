package com.multi.thread.chapter2.section3.example2;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/12 下午12:55
 */
public class PrintString implements Runnable {

    private boolean isContinuePrint = true;

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }

    public void printStringMethod() {
        try {
            while (isContinuePrint == true) {
                System.out.println("run printStringMethod threadName = " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        printStringMethod();
    }
}
