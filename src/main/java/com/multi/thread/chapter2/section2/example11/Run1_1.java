package com.multi.thread.chapter2.section2.example11;


/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 下午1:37
 */
public class Run1_1 {

    public static void main(String[] args) throws Exception {
        Service service = new Service();
        MyObject object = new MyObject();
        MyThreadA a = new MyThreadA(service, object);
        a.setName("A");
        a.start();
        MyThreadB b = new MyThreadB(service, object);
        b.setName("B");
        b.start();
    }
}
