package com.multi.thread.chapter3.section1.example17;

import java.io.PipedInputStream;
import java.io.PipedReader;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午11:48
 */
public class ThreadRead extends Thread {

    private ReadData read;

    private PipedReader input;

    public ThreadRead(ReadData read, PipedReader input) {
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
