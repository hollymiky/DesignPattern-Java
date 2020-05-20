package com.ann.lazy;

/**
 * @author longquan
 * @date 2020/5/20 8:38 下午
 *
 * 懒汉式-同步代码块
 *
 * 此方式还是可能造成多个线程进入if判断，产生多个实例对象，
 * 并不能保证线程安全问题，这种方式不能使用！
 *
 * 进一步优化方案 参考com.ann.lazy.LazySingleton04
 */
public class LazySingleton03 {

    public static void main(String[] args) {
        LazySingleton3 singleton1 = LazySingleton3.getInstance();
        LazySingleton3 singleton2 = LazySingleton3.getInstance();

        System.out.println(singleton1 == singleton2);
        System.out.println("----------------------");
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

class LazySingleton3 {
    //  1. 构造器私有化，防止外部实例化
    private LazySingleton3() {
    }

    private static LazySingleton3 instance;

    //  2. 对外提供一个静态方法，懒加载LazySingleton3的实例
    public static synchronized LazySingleton3 getInstance() {
        //  判断当前instance是否已经实例化
        if (instance == null) {
            //  未实例化过才去完成实例化，使用同步代码块
            synchronized (LazySingleton3.class){
                instance = new LazySingleton3();
            }
        }
        return instance;
    }
}
