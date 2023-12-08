package com.multi.thread.chapter3.section1.example14;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午10:48
 */
public class C {

    private String lock;

    public C(String lock) {
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                while (ValueObject.value.equals("")) {
                    System.out.println("消费者 " + Thread.currentThread().getName() + "waiting了$");
                    lock.wait();
                }
                System.out.println("消费者 " + Thread.currentThread().getName() + "runnable了");
                ValueObject.value = "";
                //lock.notify();
                lock.notifyAll();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
