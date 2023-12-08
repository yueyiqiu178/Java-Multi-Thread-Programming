package com.multi.thread.chapter4.section1.example10;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/20 下午2:29
 */
public class RunFair {

    public static void main(String[] args) throws Exception {
        //final Service service = new Service(true);
        final Service service = new Service(false);
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("A线程" + Thread.currentThread().getName() + "运行了");
                service.serviceMethod();
            }
        };
        Thread[] threadArray = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
    }
}
