package com.multi.thread.chapter1.example28;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午3:18
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            SynchronizedObject object = new SynchronizedObject();
            MyThread thread = new MyThread(object);
            thread.start();
            Thread.sleep(500);
            thread.stop();
            System.out.println(object.getUsername() + " " + object.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
