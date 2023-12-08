package com.multi.thread.chapter1.example27;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午3:10
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyThread thread = new MyThread();
        thread.start();
    }
}
