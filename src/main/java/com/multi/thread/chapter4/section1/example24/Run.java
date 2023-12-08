package com.multi.thread.chapter4.section1.example24;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/21 下午8:07
 */
public class Run {

    private volatile static int nextPrintWho = 1;

    private static ReentrantLock lock = new ReentrantLock();

    private static final Condition conditionA = lock.newCondition();

    private static final Condition conditionB = lock.newCondition();

    private static final Condition conditionC = lock.newCondition();

    public static void main(String[] args) throws Exception {
        Thread threadA = new Thread() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrintWho != 1) {
                        conditionA.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Thread:A" + (i + 1));
                    }
                    System.out.println("A End");
                    nextPrintWho = 2;
                    conditionA.signalAll();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrintWho != 2) {
                        conditionA.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Thread:B" + (i + 1));
                    }
                    System.out.println("B End");
                    nextPrintWho = 3;
                    conditionA.signalAll();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };

        Thread threadC = new Thread() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrintWho != 3) {
                        conditionA.await();
                    }
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Thread:C" + (i + 1));
                    }
                    System.out.println("C End");
                    nextPrintWho = 1;
                    conditionA.signalAll();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        };

        Thread[] aArray = new Thread[5];
        Thread[] bArray = new Thread[5];
        Thread[] cArray = new Thread[5];
        for (int i = 0; i < 5; i++) {
            aArray[i] = new Thread(threadA);
            bArray[i] = new Thread(threadB);
            cArray[i] = new Thread(threadC);
            aArray[i].start();
            bArray[i].start();
            cArray[i].start();
        }
    }
}
