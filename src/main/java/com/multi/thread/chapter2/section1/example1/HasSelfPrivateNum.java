package com.multi.thread.chapter2.section1.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午5:02
 */
public class HasSelfPrivateNum {

    public void addI(String username) {
        try {
            int num = 0;
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println(username + " num = " + num);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
