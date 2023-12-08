package com.multi.thread.chapter1.example9;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/05 上午10:55
 */
public class LoginServlet {

    private static String usernameRef;

    private static String passwordRef;

    //public static void doPost(String username, String password) {
    public static synchronized void doPost(String username, String password) {
        try {
            usernameRef = username;
            if (username.equals("a")) {
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username = " + usernameRef + " password = " + passwordRef);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
