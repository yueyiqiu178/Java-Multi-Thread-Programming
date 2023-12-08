package com.multi.thread.chapter2.section2.example21;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 下午10:08
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            DealThread t1 = new DealThread();
            t1.setFlag("a");
            Thread thread1 = new Thread(t1);
            thread1.start();
            Thread.sleep(100);
            t1.setFlag("b");
            Thread thread2 = new Thread(t1);
            thread2.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
