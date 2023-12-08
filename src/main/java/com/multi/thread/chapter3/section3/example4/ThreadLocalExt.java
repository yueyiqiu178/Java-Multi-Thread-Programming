package com.multi.thread.chapter3.section3.example4;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/17 下午6:45
 */
public class ThreadLocalExt extends ThreadLocal {

    @Override
    protected Object initialValue() {
        return "我是默认值 第一次get不再为null";
    }
}
