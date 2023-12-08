package com.multi.thread.chapter4.section1.example12;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/20 下午8:04
 */
public class Run {

    public static void main(String[] args) throws Exception {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            public void run() {
                service.serviceMethod1();
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
        System.out.println("有线程数：" + service.lock.getQueueLength() + "在等待获取锁！");
    }
}
