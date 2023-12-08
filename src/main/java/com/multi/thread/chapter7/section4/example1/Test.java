package com.multi.thread.chapter7.section4.example1;

import java.text.SimpleDateFormat;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 下午5:14
 */
public class Test {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String[] dateStringArray = new String[] {"2000-01-01","2000-01-02","2000-01-03","2000-01-04","2000-01-05","2000-01-06","2000-01-07","2000-01-08","2000-01-09","2000-01-10"};
        MyThread[] threadArray = new MyThread[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new MyThread(sdf, dateStringArray[i]);
        }
        for (int i = 0; i < 10; i++) {
            threadArray[i].start();
        }
    }
}
