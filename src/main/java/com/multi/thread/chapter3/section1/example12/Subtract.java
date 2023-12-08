package com.multi.thread.chapter3.section1.example12;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/15 下午10:55
 */
public class Subtract {

    private String lock;

    public Subtract(String lock) {
        this.lock = lock;
    }

    public void subtract() {
        try {
            synchronized (lock) {
                if (ValueObject.list.size() == 0) {
                //while (ValueObject.list.size() == 0) {
                    System.out.println("wait begin ThreadName = " + Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("wait end ThreadName = " + Thread.currentThread().getName());
                }
                Thread.sleep(1000);
                ValueObject.list.remove(0);
                System.out.println("list size = " + ValueObject.list.size() + "||" + Thread.currentThread().getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
