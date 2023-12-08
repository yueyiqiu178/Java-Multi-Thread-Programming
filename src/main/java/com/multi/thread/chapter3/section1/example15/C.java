package com.multi.thread.chapter3.section1.example15;

/**
 * @Description
 * @Author dongzonglei
 * @Date 2018/12/16 上午11:22
 */
public class C {

    private MyStack myStack;

    public C(MyStack myStack) {
        this.myStack = myStack;
    }

    public void popService() {

        System.out.println("pop = " + myStack.pop());
    }
}
