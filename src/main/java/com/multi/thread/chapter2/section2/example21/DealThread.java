package com.multi.thread.chapter2.section2.example21;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 下午6:42
 */
public class DealThread implements Runnable {

    public String username;

    public Object lock1 = new Object();

    public Object lock2 = new Object();

    public void setFlag(String username) {
        this.username = username;
    }

    public void run() {
        if (username.equals("a")) {
            synchronized (lock1) {
                try {
                    System.out.println("username = " + username);
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                synchronized (lock2) {
                    System.out.println("按lock1->lock2代码顺序执行");
                }
            }
        }

        if (username.equals("b")) {
            synchronized (lock2) {
                try {
                    System.out.println("username = " + username);
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                synchronized (lock1) {
                    System.out.println("按lock2->lock1代码顺序执行");
                }
            }
        }
    }
}
