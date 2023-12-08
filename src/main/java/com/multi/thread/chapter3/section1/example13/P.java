package com.multi.thread.chapter3.section1.example13;

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
                if (!ValueObject.value.equals("")) {
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set的值是：" + value);
                ValueObject.value = value;
                lock.notify();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
