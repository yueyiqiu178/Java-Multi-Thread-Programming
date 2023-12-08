package com.multi.thread.chapter5.section1.example2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/22 下午1:12
 */
public class Run5 {

    static int i = 0;

    public static class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("正常执行了" + i);
        }
    }

    public static void main(String[] args) throws Exception {
        while (true) {
            try {
                i++;
                Timer timer = new Timer();
                MyTask task = new MyTask();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String dateString = "2018-12-22 13:12:00";
                Date dateRef = sdf.parse(dateString);
                timer.schedule(task, dateRef);
                timer.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
