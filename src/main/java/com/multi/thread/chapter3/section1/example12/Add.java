package com.multi.thread.chapter3.section1.example12;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/15 下午10:53
 */
public class Add {

    private String lock;

    public Add(String lock) {
        this.lock = lock;
    }

    public void add() {
        synchronized (lock) {
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}
