package com.multi.thread.chapter7.section4.example3;

import java.text.SimpleDateFormat;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 下午5:26
 */
public class DateTools {

    private static ThreadLocal<SimpleDateFormat> tl = new ThreadLocal<SimpleDateFormat>();

    public static SimpleDateFormat getSimpleDateFormat(String datePattern) {
        SimpleDateFormat sdf = null;
        sdf = tl.get();
        if (sdf == null) {
            sdf = new SimpleDateFormat(datePattern);
            tl.set(sdf);
        }
        return sdf;
    }
}
