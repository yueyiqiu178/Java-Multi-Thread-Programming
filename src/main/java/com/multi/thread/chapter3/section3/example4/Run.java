package com.multi.thread.chapter3.section3.example4;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/17 下午9:38
 */
public class Run {

    public static ThreadLocalExt tl = new ThreadLocalExt();

    public static void main(String[] args) throws Exception {
        if (tl.get() == null) {
            System.out.println("从未放过值");
            tl.set("我的值");
        }
        System.out.println(tl.get());
        System.out.println(tl.get());
    }
}
