package com.multi.thread.chapter4.section1.example21;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/21 下午7:48
 */
public class Run {

    public static void main(String[] args) throws Exception {
        final MyService service = new MyService();
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName() + "调用waitMethod时间：" + System.currentTimeMillis());
                service.waitMethod();
            }
        };
        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();
        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
    }
}
