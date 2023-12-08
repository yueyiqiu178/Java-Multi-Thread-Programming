package com.multi.thread.chapter2.section2.example9;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/11 上午10:05
 */
public class MyThreadB extends Thread {

    private MyList myList;

    public MyThreadB(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            myList.add("threadb" + (i + 1));
        }
    }
}
