package com.multi.thread.chapter3.section1.example16;

import java.io.PipedOutputStream;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午11:42
 */
public class WriteData {

    public void writeMethod(PipedOutputStream out) {
        try {
            System.out.println("write : ");
            for (int i = 0; i < 300; i++) {
                String outData = "," + (i + 1);
                out.write(outData.getBytes());
                System.out.println(outData);
            }
            System.out.println();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
