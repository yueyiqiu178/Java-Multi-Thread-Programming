package com.multi.thread.chapter3.section1.example14;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午10:48
 */
public class P {

    private String lock;

    public P(String lock) {
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                while (!ValueObject.value.equals("")) {
                    System.out.println("生产者" + Thread.currentThread().getName() + "waiting了#");
                    lock.wait();
                }
                System.out.println("生产者" + Thread.currentThread().getName() + "runnable了");
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                ValueObject.value = value;
                //lock.notify();
                lock.notifyAll();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
