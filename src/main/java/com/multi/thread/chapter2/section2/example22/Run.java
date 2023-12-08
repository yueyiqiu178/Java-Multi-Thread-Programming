package com.multi.thread.chapter2.section2.example22;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/12 上午9:27
 */
public class Run {

    public static void main(String[] args) throws Exception {
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("usernameValue");
        publicClass.setPassword("passwordValue");

        System.out.println(publicClass.getUsername() + " " + publicClass.getPassword());

        PublicClass.PrivateClass privateClass = publicClass.new PrivateClass();
        privateClass.setAge("ageValue");
        privateClass.setAddress("addressValue");
        System.out.println(privateClass.getAge() + " " + privateClass.getAddress());
    }
}
