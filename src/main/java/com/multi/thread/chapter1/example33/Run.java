package com.multi.thread.chapter1.example33;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午3:41
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            final MyObject object = new MyObject();
            Thread thread1 = new Thread() {
                @Override
                public void run() {
                    object.setValue("a", "aa");
                }
            };
            thread1.setName("a");
            thread1.start();
            Thread.sleep(500);
            Thread thread2 = new Thread() {
                @Override
                public void run() {
                    object.printUsernamePassword();
                }
            };
            thread2.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
