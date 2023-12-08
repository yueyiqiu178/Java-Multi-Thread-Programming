package com.multi.thread.chapter3.section1.example12;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/15 下午10:58
 */
public class Run {

    public static void main(String[] args) throws Exception {
        String lock = new String("");
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);
        ThreadSubtract subtract1Thread = new ThreadSubtract(subtract);
        subtract1Thread.setName("subtract1Thread");
        subtract1Thread.start();
        ThreadSubtract subtract2Thread = new ThreadSubtract(subtract);
        subtract2Thread.setName("subtract2Thread");
        subtract2Thread.start();
        Thread.sleep(10000);
        ThreadAdd addThread = new ThreadAdd(add);
        addThread.setName("addThread");
        addThread.start();
    }
}
