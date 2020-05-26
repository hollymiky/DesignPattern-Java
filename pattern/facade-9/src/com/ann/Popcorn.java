package com.ann;

/**
 * @author longquan
 *
 * 爆米花机
 */
public class Popcorn {

    private static Popcorn instance = new Popcorn();

    //  单例模式-饿汉式
    private Popcorn(){

    }

    public static Popcorn getInstance(){
        return instance;
    }

    //  功能
    public void on(){
        System.out.println(" popcorn on...");
    }

    public void off(){
        System.out.println(" popcorn off...");
    }

    public void pop(){
        System.out.println(" popcorn pop...");
    }
}
