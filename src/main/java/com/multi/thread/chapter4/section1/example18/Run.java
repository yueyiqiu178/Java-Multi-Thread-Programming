package com.multi.thread.chapter4.section1.example18;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/20 下午10:24
 */
public class Run {

    public static void main(String[] args) throws Exception {
        final Service service = new Service(true);
        Runnable runnable = new Runnable() {
            public void run() {
                service.serviceMethod();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
