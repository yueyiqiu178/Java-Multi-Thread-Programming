package com.multi.thread.chapter3.section3.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/17 下午6:08
 */
public class Run {

    public static ThreadLocal tl = new ThreadLocal();

    public static void main(String[] args) throws Exception {
        if (tl.get() == null) {
            System.out.println("我从未放过值");
            tl.set("我的值");
        }
        System.out.println(tl.get());
        System.out.println(tl.get());
    }
}
