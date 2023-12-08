package com.multi.thread.chapter1.example4;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/04 下午9:38
 */
public class Run {

    public static void main(String[] args) throws Exception {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束！");
    }
}
