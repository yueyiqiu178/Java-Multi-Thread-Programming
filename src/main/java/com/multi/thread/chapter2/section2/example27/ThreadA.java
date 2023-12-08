package com.multi.thread.chapter2.section2.example27;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/12 下午12:49
 */
public class ThreadA extends Thread {

    private Service service;

    private UserInfo userInfo;

    public ThreadA(Service service, UserInfo userInfo) {
        this.service = service;
        this.userInfo = userInfo;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethodA(userInfo);
    }
}
