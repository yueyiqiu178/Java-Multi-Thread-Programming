package com.multi.thread.chapter5.section1.example3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/22 下午1:03
 */
public class Run {

    public static class MyTask extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("运行了！时间为：" + new Date());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            MyTask task = new MyTask();
            Timer timer = new Timer();
            System.out.println("当前时间：" + new Date().toLocaleString());
            timer.schedule(task, 7000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
