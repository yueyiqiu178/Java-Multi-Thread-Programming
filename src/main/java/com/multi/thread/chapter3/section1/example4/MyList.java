package com.multi.thread.chapter3.section1.example4;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/14 下午4:58
 */
public class MyList {

    private static List list = new ArrayList();

    public static void add() {
        list.add("anyString");
    }

    public static int size() {
        return list.size();
    }
}
