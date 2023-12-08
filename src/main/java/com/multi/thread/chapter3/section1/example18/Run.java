package com.multi.thread.chapter3.section1.example18;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 下午12:07
 */
public class Run {

    public static void main(String[] args) throws Exception {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 20; i++) {
            BackupB output = new BackupB(dbTools);
            output.start();
            BackupA input = new BackupA(dbTools);
            input.start();
        }
    }
}
