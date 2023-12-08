package com.multi.thread.chapter2.section3.example3;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/13 下午2:37
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setRunning(false);
            System.out.println("已经赋值为false");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
