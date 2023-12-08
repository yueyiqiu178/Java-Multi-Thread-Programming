package com.multi.thread.chapter3.section1.example6;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/14 下午10:46
 */
public class NotifyThread extends Thread {

    private Object lock;

    public NotifyThread(Object lock) {
    	super("Notify");
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}
