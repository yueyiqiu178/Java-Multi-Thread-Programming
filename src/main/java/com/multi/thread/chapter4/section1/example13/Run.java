package com.multi.thread.chapter4.section1.example13;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/20 下午8:13
 */
public class Run {

    public static void main(String[] args) throws Exception {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            public void run() {
                service.waitMethod();
            }
        };
        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
        Thread.sleep(2000);
        service.notifyMethod();
    }
}
