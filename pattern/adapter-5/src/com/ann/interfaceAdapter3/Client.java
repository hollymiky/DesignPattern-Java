package com.ann.interfaceAdapter3;

/**
 * @author longquan
 */
public class Client {

    public static void main(String[] args) {

        AbstractAdapter a = new AbstractAdapter() {
            //  因为抽象类AbstractAdapter空实现了InterfaceDemo中的方法
            //  在实际用到时可以只要重写该抽象类中的某个方法即可
            @Override
            public void m1() {
                System.out.println("m1....");
            }
        };

        //  只适配m1方法
        a.m1();
    }
}
