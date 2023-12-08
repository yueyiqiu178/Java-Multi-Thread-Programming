package com.multi.thread.chapter1.example28;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午3:14
 */
public class SynchronizedObject {

    private String username = "a";

    private String password = "aa";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public synchronized void printString(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(100000);
            this.password = password;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
