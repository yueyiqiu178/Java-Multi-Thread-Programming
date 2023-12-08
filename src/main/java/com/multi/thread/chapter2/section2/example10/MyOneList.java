package com.multi.thread.chapter2.section2.example10;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 上午10:14
 */
public class MyOneList {

    private List list = new ArrayList();

    public synchronized void add(String data) {
        list.add(data);
    }

    public synchronized int getSize() {
        return list.size();
    }
}
