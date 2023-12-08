package com.multi.thread.chapter5.section1.example7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/22 下午2:25
 */
public class Run6 {

    private static Timer timer = new Timer();

    public static class MyTask1 extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("1 begin 运行了！时间为：" + new Date());
                System.out.println("1 end 运行了！时间为：" + new Date());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            MyTask1 task1 = new MyTask1();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2018-12-22 13:58:00";
            Timer timer = new Timer();
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间：" + dateRef.toLocaleString() + "当前时间：" + new Date().toLocaleString());
            timer.scheduleAtFixedRate(task1, dateRef, 5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
