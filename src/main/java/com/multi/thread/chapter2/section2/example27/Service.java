package com.multi.thread.chapter2.section2.example27;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/12 下午12:47
 */
public class Service {

    public void serviceMethodA(UserInfo userInfo) {
        synchronized (userInfo) {
            try {
                System.out.println(Thread.currentThread().getName());
                userInfo.setUsername("abcabcabc");
                Thread.sleep(3000);
                System.out.println("end! time = " + System.currentTimeMillis());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
