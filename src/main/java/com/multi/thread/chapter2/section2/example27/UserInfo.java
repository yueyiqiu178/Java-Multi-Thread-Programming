package com.multi.thread.chapter2.section2.example27;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/12 下午12:46
 */
public class UserInfo {

    private String username;

    private String password;

    public UserInfo() {
    }

    public UserInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

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
}
