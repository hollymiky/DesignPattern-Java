package com.ann.lazy;

/**
 * @author longquan
 * @date 2020/5/20 8:28 下午
 *
 *
 * 懒汉式-线程安全，同步方法
 *
 * 虽然此方式解决了线程不安全的问题，但是效率不高，不推荐使用
 *
 * 优化方案 参考 com.ann.lazy.LazySingleton03
 */
public class LazySingleton02 {

    public static void main(String[] args) {
        LazySingleton2 singleton1 = LazySingleton2.getInstance();
        LazySingleton2 singleton2 = LazySingleton2.getInstance();

        System.out.println(singleton1 == singleton2);
        System.out.println("----------------------");
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

    }
}

class LazySingleton2 {
    //  1. 构造器私有化，防止外部实例化
    private LazySingleton2() {
    }

    private static LazySingleton2 instance;

    //  2. 对外提供一个静态同步方法，懒加载LazySingleton2的实例，解决线程安全问题
    public static synchronized LazySingleton2 getInstance() {
        //  判断当前instance是否已经实例化
        if (instance == null) {
            //  未实例化过才去完成实例化
            instance = new LazySingleton2();
        }
        return instance;
    }
}
