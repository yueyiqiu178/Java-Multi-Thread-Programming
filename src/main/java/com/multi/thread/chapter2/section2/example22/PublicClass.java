package com.multi.thread.chapter2.section2.example22;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/12 上午9:25
 */
public class PublicClass {

    private String username;

    private String password;

    class PrivateClass {
        private String age;

        private String address;

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void printPublicProperty() {
            System.out.println(username + " " + password);
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
