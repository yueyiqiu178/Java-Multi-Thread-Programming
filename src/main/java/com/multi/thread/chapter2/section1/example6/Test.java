package com.multi.thread.chapter2.section1.example6;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/09 下午8:24
 */
public class Test {

    public static void main(String[] args) throws Exception {
        try {
            PublicVar publicVarRef = new PublicVar();
            ThreadA threadA = new ThreadA(publicVarRef);
            threadA.start();
            Thread.sleep(200);
            publicVarRef.getValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
