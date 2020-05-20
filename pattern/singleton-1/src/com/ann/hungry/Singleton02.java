package com.ann.hungry;

/**
 * @author longquan
 * @date 2020/5/20 5:42 下午
 *
 *
 * 饿汉式（静态代码块）
 */
public class Singleton02 {

    public static void main(String[] args) {
        Singleton2 singleton1 = Singleton2.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();

        //  判断两个实例是否为同一个
        System.out.println(singleton1 == singleton2);
        System.out.println("----------------------");
        //  判断两者的hashCode是否相同
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}


class Singleton2{

    //  1. 构造器私有化，防止实例化
    private Singleton2(){

    }

    private static Singleton2 instance;

    //  2. 在本类的静态代码块中实例化对象
    static {
        instance = new Singleton2();
    }

    //  3. 提供一个静态方法来获取这个实例对象
    public static Singleton2 getInstance(){
        return instance;
    }
}
