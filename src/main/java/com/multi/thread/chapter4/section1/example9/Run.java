package com.multi.thread.chapter4.section1.example9;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/20 下午2:05
 */
public class Run {

    public static void main(String[] args) throws Exception {
        MyService service = new MyService();
        MyThreadA[] threadA = new MyThreadA[10];
        MyThreadB[] threadB = new MyThreadB[10];
        for (int i = 0; i < 10; i++) {
            threadA[i] = new MyThreadA(service);
            threadB[i] = new MyThreadB(service);
            threadA[i].start();
            threadB[i].start();
        }
    }
}
