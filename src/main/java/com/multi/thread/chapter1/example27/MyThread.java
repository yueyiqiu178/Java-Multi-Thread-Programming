package com.multi.thread.chapter1.example27;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午3:09
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            this.stop();
        } catch (Exception e) {
            System.out.println("进入了catch()方法");
            e.printStackTrace();
        }
    }
}
