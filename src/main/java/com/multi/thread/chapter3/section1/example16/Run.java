package com.multi.thread.chapter3.section1.example16;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午11:50
 */
public class Run {

    public static void main(String[] args) throws Exception {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();
            PipedInputStream inputStream = new PipedInputStream();
            PipedOutputStream outputStream = new PipedOutputStream();
            //inputStream.connect(outputStream);
            outputStream.connect(inputStream);
            ThreadRead threadRead = new ThreadRead(readData, inputStream);
            threadRead.start();
            Thread.sleep(2000);
            ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
            threadWrite.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
