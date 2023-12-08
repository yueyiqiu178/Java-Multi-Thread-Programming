package com.multi.thread.chapter2.section1.example3;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午5:06
 */
public class Run {

    public static void main(String[] args) throws Exception {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef);
        threadB.start();
    }
}
