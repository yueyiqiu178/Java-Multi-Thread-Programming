package com.multi.thread.chapter3.section1.example17;

import java.io.PipedOutputStream;
import java.io.PipedWriter;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午11:47
 */
public class ThreadWrite extends Thread {

    private WriteData write;

    private PipedWriter out;

    public ThreadWrite(WriteData write, PipedWriter out) {
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        write.writeMethod(out);
    }
}
