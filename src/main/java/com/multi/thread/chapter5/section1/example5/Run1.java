package com.multi.thread.chapter5.section1.example5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/22 下午1:49
 */
public class Run1 {

    private static Timer timer = new Timer();

    private static int runCount = 0;

    public static class MyTask1 extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("1 begin 运行了！时间为：" + new Date());
                Thread.sleep(1000);
                System.out.println("1 end 运行了！时间为：" + new Date());
                runCount++;
                if (runCount == 5) {
                    timer.cancel();
                }
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
            timer.schedule(task1, dateRef, 3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
