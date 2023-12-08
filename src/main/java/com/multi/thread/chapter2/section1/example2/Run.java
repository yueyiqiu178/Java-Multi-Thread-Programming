package com.multi.thread.chapter2.section1.example2;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午5:06
 */
public class Run {

    public static void main(String[] args) throws Exception {
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(numRef1);
        threadA.start();
        ThreadB threadB = new ThreadB(numRef2);
        threadB.start();
    }
}
