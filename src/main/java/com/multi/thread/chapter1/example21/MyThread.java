package com.multi.thread.chapter1.example21;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/06 下午3:58
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (this.interrupted()) {
                System.out.println("已经是停止状态了，我要退出了！");
                break;
            }
            System.out.println("i= " + (i + 1));
        }
    }
}
