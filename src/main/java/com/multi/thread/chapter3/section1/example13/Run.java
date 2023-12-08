package com.multi.thread.chapter3.section1.example13;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午10:55
 */
public class Run {

    public static void main(String[] args) throws Exception {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        ThreadP threadP = new ThreadP(p);
        ThreadC threadC = new ThreadC(c);
        threadP.start();
        threadC.start();
    }
}
