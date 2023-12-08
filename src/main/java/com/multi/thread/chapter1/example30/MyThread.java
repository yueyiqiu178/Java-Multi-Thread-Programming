package com.multi.thread.chapter1.example30;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午3:30
 */
public class MyThread extends Thread {

    private  int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true) {
            i++;
        }
    }
}
