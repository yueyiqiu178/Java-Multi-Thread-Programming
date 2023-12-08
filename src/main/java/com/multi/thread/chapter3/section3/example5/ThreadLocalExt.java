package com.multi.thread.chapter3.section3.example5;

import java.util.Date;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/17 下午6:45
 */
public class ThreadLocalExt extends ThreadLocal {

    @Override
    protected Object initialValue() {

        return new Date().getTime();
    }
}
