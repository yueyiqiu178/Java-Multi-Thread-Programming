package com.multi.thread.chapter3.section1.example4;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/14 下午4:59
 */
public class ThreadA extends Thread {

    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                if (MyList.size() != 5) {
                    System.out.println("wait begin " + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("wait end   " + System.currentTimeMillis());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
