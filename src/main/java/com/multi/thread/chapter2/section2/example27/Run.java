package com.multi.thread.chapter2.section2.example27;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/12 下午12:49
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            Service service = new Service();
            UserInfo userInfo = new UserInfo();
            ThreadA a = new ThreadA(service, userInfo);
            a.setName("A");
            a.start();
            Thread.sleep(50);
            ThreadB b = new ThreadB(service, userInfo);
            b.setName("B");
            b.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
