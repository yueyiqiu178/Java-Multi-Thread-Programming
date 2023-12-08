package com.multi.thread.chapter3.section1.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/14 上午9:11
 */
public class MyList {

    private List list = new ArrayList();

    public void add() {
        list.add("高洪岩");
    }

    public int size() {
        return list.size();
    }
}
