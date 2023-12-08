package com.multi.thread.chapter1.example18;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/06 上午9:55
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Thread runThread = Thread.currentThread();
        System.out.println(runThread.getName() + " " + runThread.getId());
    }
}
