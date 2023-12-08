package com.multi.thread.chapter3.section4.example2;

import java.util.Date;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/18 上午9:31
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {

    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue + "我在子线程加的~！";
    }
}
