package com.multi.thread.chapter7.section2.example6;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 下午12:05
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            ThreadGroup group = new ThreadGroup("我的线程组");
            for (int i = 0; i < 5; i++) {
                MyThread thread = new MyThread(group, "线程" + (i + 1));
                thread.start();
            }
            Thread.sleep(5000);
            group.interrupt();
            System.out.println("调用了interrupt()方法");
        } catch (Exception e) {
            System.out.println("停了停了！");
            e.printStackTrace();
        }
    }
}
