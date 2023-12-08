package com.multi.thread.chapter2.section1.example9;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午8:49
 */
public class Test {

    public static void main(String[] args) throws Exception {
        try {
            Service service = new Service();
            ThreadA a = new ThreadA(service);
            a.setName("A");
            a.start();
            Thread.sleep(500);
            ThreadB b = new ThreadB(service);
            b.setName("B");
            b.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
