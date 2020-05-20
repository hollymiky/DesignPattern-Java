package com.ann.lazy;

/**
 * @author longquan
 * @date 2020/5/20 9:06 下午
 *
 *
 * 懒加载-静态内部类
 *
 * 线程安全、懒加载
 * 推荐使用
 */
public class LazySingleton05 {

    public static void main(String[] args) {
        LazySingleton5 singleton1 = LazySingleton5.getInstance();
        LazySingleton5 singleton2 = LazySingleton5.getInstance();

        System.out.println(singleton1 == singleton2);
        System.out.println("----------------------");
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

class LazySingleton5{
    //  1. 构造器私有化，防止外部实例化
    private LazySingleton5() {}

    //  2. 创建一个静态内部类创建singleton对象
    //  当类LazySingleton5被装载时，静态内部类SingletonInstance不会马上被装载
    //  静态内部类只会被加载一次
    private static class SingletonInstance{
        private final static LazySingleton5 INSTANCE = new LazySingleton5();
    }

    //  当调用此方法时，静态内部类SingletonInstance才会被加载（类加载时是线程安全的）
    public static LazySingleton5 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
