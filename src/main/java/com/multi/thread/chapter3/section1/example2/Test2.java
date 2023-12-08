package com.multi.thread.chapter3.section1.example2;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/14 上午9:26
 */
public class Test2 {

    public static void main(String[] args) throws Exception {
        try {
            String lock = new String();
            System.out.println("syn上面");
            synchronized (lock) {
                System.out.println("syn第一行");
                lock.wait();
                System.out.println("wait下的代码");
            }
            System.out.println("syn下面的代码");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
