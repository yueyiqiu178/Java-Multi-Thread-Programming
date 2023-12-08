package com.multi.thread.chapter3.section3.example3;

import java.util.Date;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/17 下午6:23
 */
public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                if (Tools.tl.get() == null) {
                    Tools.tl.set(new Date());
                }
                System.out.println("B " + Tools.tl.get().getTime());
                Thread.sleep(100);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
