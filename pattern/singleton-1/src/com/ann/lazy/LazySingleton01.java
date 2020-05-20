package com.ann.lazy;

/**
 * @author longquan
 * @date 2020/5/20 5:52 下午
 * <p>
 * <p>
 * 懒汉式（线程不安全）
 *
 * 线程不安全，单线程下可以使用
 * 优化方案 参考 com.ann.lazy.LazySingleton02
 */
public class LazySingleton01 {

    public static void main(String[] args) {
        LazySingleton1 singleton1 = LazySingleton1.getInstance();
        LazySingleton1 singleton2 = LazySingleton1.getInstance();

        //  如果单线程是不会有问题的
        System.out.println(singleton1 == singleton2);
        System.out.println("----------------------");
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

        Runnable task = () -> {
            LazySingleton1 obj = LazySingleton1.getInstance();
            System.out.println(Thread.currentThread().getName() + " ===> " + obj.hashCode());
        };
        // 模拟多线程环境下使用 LazySingleton1 类获得对象
        for (int i = 0; i < 1000; i++) {
            new Thread(task, "" + i).start();
        }

    }
}

class LazySingleton1 {
    //  1. 构造器私有化，防止外部实例化
    private LazySingleton1() {
    }

    private static LazySingleton1 instance;

    //  2. 对外提供一个静态方法，懒加载LazySingleton1的实例
    public static LazySingleton1 getInstance() {
        //  判断当前instance是否已经实例化
        if (instance == null) {
            //  未实例化过才去完成实例化
            instance = new LazySingleton1();
        }
        return instance;
    }
}
