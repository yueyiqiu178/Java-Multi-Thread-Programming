package com.multi.thread.chapter3.section2.example1;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 下午12:16
 */
public class Test {

    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        myThread.start();
//        Thread.sleep();
        System.out.println("我想当myThread对象执行完毕之后我再执行");
        System.out.println("但上面代码中的sleep中的值应该写多少呢");
        System.out.println("答案是：根据不能确定");
    }
}
