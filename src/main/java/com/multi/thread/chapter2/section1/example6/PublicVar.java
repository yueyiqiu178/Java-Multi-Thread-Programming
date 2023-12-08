package com.multi.thread.chapter2.section1.example6;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午8:18
 */
public class PublicVar {

    private String username = "A";

    private String password = "AA";

    public synchronized void setValue(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue method thread name = " + Thread.currentThread().getName() + " username = " + username + " password = " + password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void getValue() {
        System.out.println("getValue method thread name = " + Thread.currentThread().getName() + " username = " + username + " password = " + password);
    }
}
