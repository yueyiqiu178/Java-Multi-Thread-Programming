package com.multi.thread.chapter3.section1.example2;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/14 上午9:24
 */
public class Test1 {

    public static void main(String[] args) throws Exception {
        try {
            String newString = new String();
            newString.wait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
