package com.multi.thread.chapter1.example26;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午3:06
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(8000);
            thread.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
