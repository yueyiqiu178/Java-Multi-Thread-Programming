package com.multi.thread.chapter7.section4.example2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/24 下午5:26
 */
public class DateTools {

    public static Date parse(String formatPattern, String dateString) throws Exception {
        return new SimpleDateFormat(formatPattern).parse(dateString);
    }

    public static String format(String formatPattern, Date date) {
        return new SimpleDateFormat(formatPattern).format(date).toString();
    }
}
