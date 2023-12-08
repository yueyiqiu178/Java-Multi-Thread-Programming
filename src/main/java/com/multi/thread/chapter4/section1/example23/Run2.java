package com.multi.thread.chapter4.section1.example23;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/21 下午8:04
 */
public class Run2 {

    public static void main(String[] args) throws Exception {
        Service service = new Service();
        MyThreadA myThreadA = new MyThreadA(service);
        myThreadA.start();
        Thread.sleep(2000);
        MyThreadB myThreadB = new MyThreadB(service);
        myThreadB.start();
    }
}
