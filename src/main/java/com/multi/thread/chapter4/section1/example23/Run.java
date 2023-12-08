package com.multi.thread.chapter4.section1.example23;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/21 下午7:55
 */
public class Run {

    public static void main(String[] args) throws Exception {
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        myThreadA.start();
    }
}
