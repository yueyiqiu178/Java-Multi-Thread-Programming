package com.multi.thread.chapter5.section1.example2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/22 下午1:03
 */
public class Run3 {

    public static class MyTaskA extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("A运行了！时间为：" + new Date());
                this.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static class MyTaskB extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("B运行了！时间为：" + new Date());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            MyTaskA taskA = new MyTaskA();
            MyTaskB taskB = new MyTaskB();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2018-12-22 13:12:00";
            Timer timer = new Timer();
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间：" + dateRef.toLocaleString() + "当前时间：" + new Date().toLocaleString());
            timer.schedule(taskA, dateRef, 4000);
            timer.schedule(taskB, dateRef, 4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
