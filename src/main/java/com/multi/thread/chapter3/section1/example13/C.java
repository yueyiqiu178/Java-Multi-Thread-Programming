package com.multi.thread.chapter3.section1.example13;

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
                if (ValueObject.value.equals("")) {
                    lock.wait();
                }
                System.out.println("get的值是：" + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
