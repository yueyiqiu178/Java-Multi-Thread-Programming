package com.multi.thread.chapter2.section1.example8;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午8:39
 */
public class Sub extends Main {

    @Override
    public synchronized void operateIMainMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("sub print i = " + i);
                Thread.sleep(100);
                super.operateIMainMethod();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
