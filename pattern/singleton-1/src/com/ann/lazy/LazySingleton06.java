package com.ann.lazy;

/**
 * @author longquan
 * @date 2020/5/20 9:23 下午
 *
 * 懒汉式-枚举
 *
 * 使用枚举可以实现单例，推荐使用
 */
public class LazySingleton06 {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton1 == singleton2);
        System.out.println("----------------------");
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

        singleton1.test();
    }
}

enum Singleton{
    INSTANCE;

    public void test(){
        System.out.println(" Enum Singleton run. ");
    }
}
