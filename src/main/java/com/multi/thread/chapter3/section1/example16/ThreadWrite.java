package com.multi.thread.chapter3.section1.example16;

import java.io.PipedOutputStream;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午11:47
 */
public class ThreadWrite extends Thread {

    private WriteData write;

    private PipedOutputStream out;

    public ThreadWrite(WriteData write, PipedOutputStream out) {
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}
