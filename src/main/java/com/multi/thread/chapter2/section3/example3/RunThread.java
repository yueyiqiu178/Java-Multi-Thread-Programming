package com.multi.thread.chapter2.section3.example3;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/13 下午2:35
 */
public class RunThread extends Thread {

    private volatile boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run() {
        System.out.println("进入run了");
        while (isRunning == true) {
//            System.out.println("run printStringMethod threadName = " + Thread.currentThread().getName());
//            try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
        }
        System.out.println("线程被停止了");
    }
}
