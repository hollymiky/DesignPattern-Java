package com.ann.hungry;

/**
 * @author longquan
 * @date 2020/5/20 5:26 下午
 *
 *
 * 饿汉式（静态变量）
 */
public class Singleton01 {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        //  判断两个实例是否为同一个
        System.out.println(singleton1 == singleton2);
        System.out.println("----------------------");
        //  判断两者的hashCode是否相同
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}


class Singleton{

    //  1. 构造器私有化，防止实例化
    private Singleton(){

    }

    //  2. 在本类内部创建对象实例
    private static final Singleton instance = new Singleton();

    //  3. 提供一个静态方法来获取这个实例对象
    public static Singleton getInstance(){
        return instance;
    }
}
