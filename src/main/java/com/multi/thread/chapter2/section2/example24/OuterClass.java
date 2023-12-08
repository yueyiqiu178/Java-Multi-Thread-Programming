package com.multi.thread.chapter2.section2.example24;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/12 上午9:45
 */
public class OuterClass {

    static class Inner {

        public void method1() {
            synchronized (new Integer(1)) {
                for(int i = 0; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " i = " + i);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {

                    }
                }
            }
        }

        public synchronized void method2() {
            for (int i = 11; i < 20; i++) {
                System.out.println(Thread.currentThread().getName() + " i = " + i);
                try {
                    Thread.sleep(100);
                } catch (Exception e) {

                }
            }
        }
    }
}
