package com.multi.thread.chapter2.section1.example8;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午8:41
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateIMainMethod();
    }
}
