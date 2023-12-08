package com.multi.thread.chapter2.section3.example6;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/13 下午3:02
 */
public class MyThread extends Thread {

    private MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.addNum();
    }
}
