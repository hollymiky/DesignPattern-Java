package com.ann.lazy;

/**
 * @author longquan
 * @date 2020/5/20 8:50 下午
 *
 * 懒汉式-双重检查--推荐使用
 *
 * 解决线程安全问题+效率问题
 *
 * 线程安全、延迟加载、效率较高
 */
public class LazySingleton04 {

    public static void main(String[] args) {
        LazySingleton4 singleton1 = LazySingleton4.getInstance();
        LazySingleton4 singleton2 = LazySingleton4.getInstance();

        System.out.println(singleton1 == singleton2);
        System.out.println("----------------------");
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

class LazySingleton4 {
    //  1. 构造器私有化，防止外部实例化
    private LazySingleton4() {
    }

    //  使用 volatile 关键字，内存可见性。直接从主存中读取数据，防止指令重排
    private static volatile LazySingleton4 instance;

    //  2. 对外提供一个静态方法，懒加载LazySingleton4的实例
    public static synchronized LazySingleton4 getInstance() {
        //  判断当前instance是否已经实例化
        if (instance == null) {
            //  未实例化过才去完成实例化，使用同步代码块
            synchronized (LazySingleton4.class){
                //  在同步代码块中在一次进行判断
                if(instance == null){
                    instance = new LazySingleton4();
                }
            }

        }
        return instance;
    }
}
