package com.multi.thread.chapter3.section1.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/14 上午9:12
 */
public class ThreadB extends Thread {

    private MyList list;

    public ThreadB(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (list.size() >= 5) {
                    System.out.println("==5了，线程b要退出了");
                    throw new InterruptedException();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
