package com.multi.thread.chapter2.section2.example10;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 上午10:15
 */
public class MyService {

    public MyOneList addServiceMethod(MyOneList list, String data) {
        try {
            synchronized (list) {
                if (list.getSize() < 1) {
                    Thread.sleep(2000);
                    list.add(data);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
