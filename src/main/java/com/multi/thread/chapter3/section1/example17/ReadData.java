package com.multi.thread.chapter3.section1.example17;

import java.io.PipedInputStream;
import java.io.PipedReader;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午11:44
 */
public class ReadData {

    public void readMethod(PipedReader input) {
        try {
            System.out.println("read : ");
            char[] bytes = new char[20];
            int readLength = input.read(bytes);
            while (readLength != -1) {
                String newData = new String(bytes, 0, readLength);
                System.out.println(newData);
                readLength = input.read(bytes);
            }
            System.out.println();
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
