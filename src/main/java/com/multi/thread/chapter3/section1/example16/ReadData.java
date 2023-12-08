package com.multi.thread.chapter3.section1.example16;

import java.io.PipedInputStream;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午11:44
 */
public class ReadData {

    public void readMethod(PipedInputStream input) {
        try {
            System.out.println("read : ");
            byte[] bytes = new byte[20];
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
