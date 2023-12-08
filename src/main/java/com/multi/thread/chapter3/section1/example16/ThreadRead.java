package com.multi.thread.chapter3.section1.example16;

import java.io.PipedInputStream;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午11:48
 */
public class ThreadRead extends Thread {

    private ReadData read;

    private PipedInputStream input;

    public ThreadRead(ReadData read, PipedInputStream input) {
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
