package com.multi.thread.chapter2.section3.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/12 下午12:57
 */
public class Run {

    public static void main(String[] args) throws Exception {
        PrintString printString = new PrintString();
        printString.printStringMethod();
        System.out.println("我要停止它！stopThread = " + Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }
}
