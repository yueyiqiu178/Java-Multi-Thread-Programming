package com.multi.thread.chapter3.section1.example17;

import java.io.PipedOutputStream;
import java.io.PipedWriter;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午11:42
 */
public class WriteData {

    public void writeMethod(PipedWriter out) {
        try {
            System.out.println("write : ");
            for (int i = 0; i < 300; i++) {
                String outData = "," + (i + 1);
                out.write(outData);
                System.out.println(outData);
            }
            System.out.println();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
