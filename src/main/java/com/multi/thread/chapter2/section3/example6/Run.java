package com.multi.thread.chapter2.section3.example6;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/13 下午3:02
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            MyService myService = new MyService();
            MyThread[] array = new MyThread[5];
            for (int i = 0; i < array.length; i++) {
                array[i] = new MyThread(myService);
            }
            for (int i = 0; i < array.length; i++) {
                array[i].start();
            }
            Thread.sleep(1000);
            System.out.println(myService.aiRef.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
