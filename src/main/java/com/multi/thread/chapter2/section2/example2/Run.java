package com.multi.thread.chapter2.section2.example2;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/10 下午5:08
 */
public class Run {

    public static void main(String[] args) throws Exception {
        ObjectService service = new ObjectService();
        ThreadA a = new ThreadA(service);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("b");
        b.start();
    }
}
