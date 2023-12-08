package com.multi.thread.chapter1.example9;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/05 上午10:59
 */
public class Run {

    public static void main(String[] args) throws Exception {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }
}
