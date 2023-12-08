package com.multi.thread.chapter3.section1.example18;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 下午12:06
 */
public class BackupA extends Thread {

    private DBTools dbTools;

    public BackupA(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}
