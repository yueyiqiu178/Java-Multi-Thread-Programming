package com.multi.thread.chapter1.example31;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午3:41
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            final SynchronizedObject object = new SynchronizedObject();
            Thread thread1 = new Thread() {
                @Override
                public void run() {
                    object.printString();
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(1000);
            Thread thread2 = new Thread() {
                @Override
                public void run() {
                    System.out.println("thread2启动了，但进入不了printString()方法");
                    System.out.println("因为pringString()被a线程锁定并且永远suspend了");
                    object.printString();
                }
            };
            thread2.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
