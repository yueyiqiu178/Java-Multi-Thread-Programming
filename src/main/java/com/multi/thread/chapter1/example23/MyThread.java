package com.multi.thread.chapter1.example23;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/06 下午3:58
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.interrupted()) {
                    System.out.println("已经是停止状态了，我要退出了！");
                    throw new InterruptedException();
                }
                System.out.println("i= " + (i + 1));
            }
            System.out.println("我被输出，如果此代码是for又继续运行，线程并未停止！");
        } catch (Exception e) {
            System.out.println("进MyThread.java类run方法中的catch了！");
            e.printStackTrace();
        }
    }
}
