package com.multi.thread.chapter1.example20;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/06 下午1:53
 */
public class Run2 {

    public static void main(String[] args) throws Exception {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1 ？= " + Thread.interrupted());
        System.out.println("是否停止2 ？= " + Thread.interrupted());
        System.out.println("end !");
    }
}
