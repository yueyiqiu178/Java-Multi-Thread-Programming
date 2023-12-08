package com.multi.thread.chapter1.example9;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/05 上午10:58
 */
public class BLogin extends Thread {

    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}
