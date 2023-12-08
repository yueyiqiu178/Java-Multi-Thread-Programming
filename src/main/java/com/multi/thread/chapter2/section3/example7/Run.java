package com.multi.thread.chapter2.section3.example7;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/13 下午3:56
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            Service service = new Service();
            ThreadA a = new ThreadA(service);
            a.start();
            Thread.sleep(1000);
            ThreadB b = new ThreadB(service);
            b.start();
            System.out.println("已经发起停止命令了！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
