package com.multi.thread.chapter3.section1.example18;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 下午12:02
 */
public class DBTools {

    private volatile boolean prevIsA = false;

    public synchronized void backupA() {
        try {
            while (prevIsA == true) {
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("aaaaaaaaaaaaaa");
            }
            prevIsA = true;
            notifyAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void backupB() {
        try {
            while (prevIsA == false) {
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("bbbbbbbbbbb️");
            }
            prevIsA = false;
            notifyAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
