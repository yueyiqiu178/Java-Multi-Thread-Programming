package com.multi.thread.chapter4.section1.example23;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/21 下午7:53
 */
public class Service {

    private ReentrantLock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            Calendar calendarRef = Calendar.getInstance();
            calendarRef.add(Calendar.SECOND, 10);
            lock.lock();
            System.out.println("wait begin Timer = " + System.currentTimeMillis());
            condition.awaitUntil(calendarRef.getTime());
            System.out.println("wait end Timer = " + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notifyMethod() {
        try {
            Calendar calendarRef = Calendar.getInstance();
            calendarRef.add(Calendar.SECOND, 10);
            lock.lock();
            System.out.println("notify begin Timer = " + System.currentTimeMillis());
            condition.signalAll();
            System.out.println("notify end Timer = " + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
