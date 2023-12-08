package com.multi.thread.chapter4.section1.example9;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/20 下午2:06
 */
public class MyThreadA extends Thread {

    private MyService service;

    public MyThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            service.set();
        }
    }
}
