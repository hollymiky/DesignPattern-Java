package com.ann.classAdapter1;

/**
 * @author longquan
 * @date 2020/5/23 4:25 下午
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("---使用类适配器模式---");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
