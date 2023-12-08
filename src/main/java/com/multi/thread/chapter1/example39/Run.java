package com.multi.thread.chapter1.example39;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午9:18
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            MyThread thread = new MyThread();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println("我离开Thread对象也不再打印了，也是要停止了！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
