package com.multi.thread.chapter1.example33;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午3:39
 */
public class MyObject {

    private String username = "1";

    private String password = "11";

    public void setValue(String username, String password) {
        this.username = username;
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("线程a停止了");
            Thread.currentThread().suspend();
        }
        this.password = password;
    }

    public void printUsernamePassword() {
        System.out.println(username + " " + password);
    }
}
