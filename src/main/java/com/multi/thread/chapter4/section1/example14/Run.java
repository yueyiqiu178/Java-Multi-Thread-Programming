package com.multi.thread.chapter4.section1.example14;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/20 下午10:12
 */
public class Run {

    public static void main(String[] args) throws Exception {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            public void run() {
                service.waitMethod();
            }
        };

        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();
        Thread.sleep(500);
        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
        Thread.sleep(500);
        System.out.println(service.lock.hasQueuedThread(threadA));
        System.out.println(service.lock.hasQueuedThread(threadB));
        System.out.println(service.lock.hasQueuedThreads());
    }
}
