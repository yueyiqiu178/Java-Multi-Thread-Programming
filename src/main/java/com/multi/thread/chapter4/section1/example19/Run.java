package com.multi.thread.chapter4.section1.example19;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/21 下午7:35
 */
public class Run {

    public static void main(String[] args) throws Exception {
        final MyService service = new MyService();
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
        threadB.interrupt();
        System.out.println("main end ！");
    }
}
