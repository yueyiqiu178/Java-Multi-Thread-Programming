package com.multi.thread.chapter1.example38;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/08 下午9:08
 */
public class ThreadA extends Thread {

    private Long count = 0L;

    public Long getCount() {
        return count;
    }

    @Override
    public void run() {
        while (true) {
            count++;
        }
    }
}
