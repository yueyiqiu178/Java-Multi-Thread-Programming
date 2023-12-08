package com.multi.thread.chapter3.section2.example3;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/17 上午11:57
 */
public class Test {

    public static void main(String[] args) throws Exception {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            myThread.join();
            //Thread.sleep(2000);
            System.out.println("end timer =   " + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
