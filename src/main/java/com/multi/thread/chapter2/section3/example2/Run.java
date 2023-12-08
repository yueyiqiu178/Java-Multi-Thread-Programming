package com.multi.thread.chapter2.section3.example2;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/12 下午1:55
 */
public class Run {

    public static void main(String[] args) throws Exception {
        PrintString printString = new PrintString();
        new Thread(printString).start();
        System.out.println("我要停止它！stopThread = " + Thread.currentThread().getName());
        Thread.sleep(3000);
        printString.setContinuePrint(false);
    }
}
