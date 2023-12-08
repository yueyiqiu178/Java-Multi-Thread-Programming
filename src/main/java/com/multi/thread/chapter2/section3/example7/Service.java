package com.multi.thread.chapter2.section3.example7;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/13 下午3:48
 */
public class Service {

    private boolean isContinueRun = true;

    public void runMethod() {
        String anyString = new String();
        while (isContinueRun == true) {
            synchronized (anyString) {

            }
        }
        System.out.println("停下来");
    }

    public void stopMethod() {
        isContinueRun = false;
    }
}
