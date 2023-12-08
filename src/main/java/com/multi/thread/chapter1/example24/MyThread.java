package com.multi.thread.chapter1.example24;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/06 下午10:38
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (Exception e) {
            System.out.println("在沉睡中被停止，进入catch " + this.isInterrupted());
            e.printStackTrace();
        }
    }
}
