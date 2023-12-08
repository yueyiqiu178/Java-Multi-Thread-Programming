package com.multi.thread.chapter5.section1.example1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/22 下午12:40
 */
public class Run1TimerIsDaemon {

    private static Timer timer = new Timer(true);

    public static class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("运行了！时间为：" + new Date());
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            Run1.MyTask task = new Run1.MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2018-12-22 12:43:00";
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间：" + dateRef.toLocaleString() + "当前时间：" + new Date().toLocaleString());
            timer.schedule(task, dateRef);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
