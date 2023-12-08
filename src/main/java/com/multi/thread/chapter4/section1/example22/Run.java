package com.multi.thread.chapter4.section1.example22;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/21 下午7:55
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            Service service = new Service();
            MyThread thread = new MyThread(service);
            thread.start();
            Thread.sleep(3000);
            thread.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
