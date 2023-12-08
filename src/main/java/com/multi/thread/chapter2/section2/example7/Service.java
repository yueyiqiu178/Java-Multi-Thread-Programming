package com.multi.thread.chapter2.section2.example7;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 上午9:24
 */
public class Service {

    private String usernameParam;

    private String passwordParam;

    private String anyString = new String();

    public void setUsernamePassword(String username, String password) {
        try {
            synchronized (anyString) {
                System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入同步块");
                usernameParam = username;
                Thread.sleep(3000);
                passwordParam = password;
                System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开同步块");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
